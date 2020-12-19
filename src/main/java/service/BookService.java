package service;

import com.google.gson.Gson;
import database.Book;
import database.BookDao;
import dto.BookDto;
import http.HttpClient;
import mapper.BookMapper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.List;

//import static sun.net.NetProperties.get;

public class BookService {

    private final HttpClient httpClient;
    private final BookDao bookDao;

    public BookService(HttpClient httpClient) {
        this.httpClient = httpClient;
        bookDao = new BookDao();
    }


    public String chooseBook(String isbnNumber) throws CustomException {
        String uri = "https://openlibrary.org/isbn/" + isbnNumber + ".json";
        return get(uri);
    }

    public String book() throws CustomException {
        String uri = "https://openlibrary.org/isbn/";
        return get(uri);
    }

    public Object getBook(String isbnNumber) throws CustomException {
        String uri = "https://openlibrary.org/isbn/"+ isbnNumber + ".json";
        String json = httpClient.get(uri);

        Gson gson = new Gson(); //gsonBuilder do uzycia deserializera
        BookDto book = gson.fromJson(json, BookDto.class);

        List<Book> entities = BookMapper.
        return book;
}

// inicjacja połaczenia i czytanie tego co przekazuje API
        private String get (String uri) throws CustomException {
            try {
                URL url = new URL(uri);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder stringBuilder = new StringBuilder();

                while ((line = in.readLine()) != null) {
                    stringBuilder.append(line);

                }
                in.close();

                return stringBuilder.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();

            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
            return null;
        }

    }







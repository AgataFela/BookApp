package service;

import com.google.gson.Gson;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.InputMismatchException;

//import static sun.net.NetProperties.get;

public class BookService {


    public String chooseBook(String isbnNumber) throws CustomException {
        String uri = "https://openlibrary.org/isbn/" + isbnNumber + ".json";
        return get(uri);
    }

    public String book() throws CustomException {
        String uri = "https://openlibrary.org/isbn/";
        return get(uri);
    }

//    public Object getBook() throws CustomException {
//        String uri = "https://openlibrary.org/isbn/";
//        String json = get(uri);
//        Gson gson = new Gson(); //gsonBuilder do uzycia deserializera
//
//        BookDto book = gson.fromJson(json, BookDto.class);
//        return book;

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







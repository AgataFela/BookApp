import http.HttpClient;
import service.BookService;
import service.CustomException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient();
        BookService bookService = new BookService(httpClient);

        try {

            System.out.println("Wybierz opcję");
            System.out.println("1) Wprowadz numer ISBN");
            System.out.println("0) Zakoncz program");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            String result;


            switch (option) {
                case 1:
                    System.out.println("Wprowadz number ISBN");
                    String isbnNumber = scanner.next();
                    result = bookService.getBook(isbnNumber).toString();

                    break;

                default:
                    result = "Nie rozpoznano wyboru";
            }

            System.out.println(result);

        } catch (CustomException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}

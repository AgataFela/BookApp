package mapper;

import com.google.gson.internal.LinkedTreeMap;
import database.Book;
import dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static List<Book> mapBookDtoToEntity(BookDto bookDto){

        List<Book> result = new ArrayList<>();
        for (String key : bookDto.getIsbn_13().keySet()) {
           Book book = new Book();
            book.setAuthors(bookDto.getAuthors());
            book.setTitle(bookDto.getTitle());
            book.setNumber_of_pages(bookDto.getNumber_of_pages());
            book.setIsbn_13(key);

            result.add(book);
        }

        return result;
    }

    public static BookDto mapBookToBookDto(Book book){

        BookDto result = new BookDto();
        result.setAuthors(book.getAuthors());
        result.setTitle(book.getTitle());
        result.getNumber_of_pages()
    }


}

package mapper;

import com.google.gson.internal.LinkedTreeMap;
import database.Book;
import dto.BookDto;

import java.util.ArrayList;
import java.util.List;

public class BookMapper {

    public static Book mapBookDtoToEntity(BookDto bookDto){

           Book book = new Book();
            book.setTitle(bookDto.getTitle());
            book.setNumber_of_pages(bookDto.getNumber_of_pages());


            String temp = "";

        for (String val: bookDto.getIsbn_13()) {
            temp = temp+val+",";
        }
            book.setIsbn_13(temp);

            return book;



    }

    public static BookDto mapBookToBookDto(Book book){

        BookDto result = new BookDto();
        result.setTitle(book.getTitle());
        result.setNumber_of_pages(book.getNumber_of_pages());
        result.setIsbn_13(book.getIsbn_13().split(","));

        return result;



    }


}

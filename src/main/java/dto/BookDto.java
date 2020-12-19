package dto;

import com.google.gson.internal.LinkedTreeMap;

public class BookDto {



    private int number_of_pages;
    private String[] isbn_13;

    private String title;



    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public String[] getIsbn_13() {
        return isbn_13;
    }

    public void setIsbn_13(String[] isbn_13) {
        this.isbn_13 = isbn_13;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "number_of_pages=" + number_of_pages +
                ", isbn_13=" + isbn_13 +
                ", title='" + title + '\'' +
                '}';
    }




}

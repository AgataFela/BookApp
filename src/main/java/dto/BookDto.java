package dto;

import com.google.gson.internal.LinkedTreeMap;

public class BookDto {

    private LinkedTreeMap<String, String> publishers; //kolekcja
    private int number_of_pages;
    private LinkedTreeMap<String, Integer> isbn_13;
    private LinkedTreeMap<String, String> authors;
    private String title;

    public LinkedTreeMap<String, String> getPublishers() {
        return publishers;
    }

    public void setPublishers(LinkedTreeMap<String, String> publishers) {
        this.publishers = publishers;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public LinkedTreeMap<String, Integer> getIsbn_13() {
        return isbn_13;
    }

    public void setIsbn_13(LinkedTreeMap<String, Integer> isbn_13) {
        this.isbn_13 = isbn_13;
    }

    public LinkedTreeMap<String, String> getAuthors() {
        return authors;
    }

    public void setAuthors(LinkedTreeMap<String, String> authors) {
        this.authors = authors;
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
                "publishers=" + publishers +
                ", number_of_pages=" + number_of_pages +
                ", isbn_13=" + isbn_13 +
                ", authors=" + authors +
                ", title='" + title + '\'' +
                '}';
    }




}

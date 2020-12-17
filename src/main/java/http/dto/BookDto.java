package http.dto;

public class BookDto {

    private String publishers;

    private int number_of_pages;
    private int isbn_13;
    private int covers;
    private String authors;
    private String title;
    private String firstSentence;

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public int getIsbn_13() {
        return isbn_13;
    }

    public void setIsbn_13(int isbn_13) {
        this.isbn_13 = isbn_13;
    }

    public int getCovers() {
        return covers;
    }

    public void setCovers(int covers) {
        this.covers = covers;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstSentence() {
        return firstSentence;
    }

    public void setFirstSentence(String firstSentence) {
        this.firstSentence = firstSentence;
    }

    @Override
    public String toString() {
        return "bookDto{" +
                "publishers='" + publishers + '\'' +
                ", number_of_pages=" + number_of_pages +
                ", isbn_10=" + isbn_13 +
                ", covers=" + covers +
                ", authors='" + authors + '\'' +
                ", title='" + title + '\'' +
                ", firstSentence='" + firstSentence + '\'' +
                '}';
    }
}

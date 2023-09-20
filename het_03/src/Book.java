public class Book {

    private String title;
    private String author;
    private int yearOfPublish;
    private String publisher;
    private Boolean isEbook;

    public Book(String title, String author, int yearOfPublish, String publisher, Boolean isEbook) {
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
        this.publisher = publisher;
        this.isEbook = isEbook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public String getPublisher() {
        return publisher;
    }

    public Boolean getIsEbook() {
        return isEbook;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsEbook(Boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String toString() {
        return "Title: " + title + ", author: " + author + ", yearOfPublish: " + yearOfPublish + ", publisher: " + publisher + ", isEbook: " + isEbook;
    }

}

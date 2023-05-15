import java.util.Objects;

public class Book {
    private String nameBook;

    private Author author;

    private int yearOfIssue;
    public Book(String nameBook,Author author,int yearOfIssue){
        this.nameBook=nameBook;
        this.author =author;
        this.yearOfIssue = yearOfIssue;


    }
    public String getNameBook(){
        return this.nameBook;
    }
    public  Author getAuthor() {

        return author;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    @Override
    public String toString(){
       return nameBook+" "+ author+" "+yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfIssue == book.yearOfIssue && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, yearOfIssue);
    }
}

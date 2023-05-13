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




}

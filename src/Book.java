public class Book {
    private String nameBook;
    private Author author;
    private int yearOfIssue;
    public Book(String nameBook,int yearOfIssue){
        this.nameBook=nameBook;
        this.yearOfIssue = yearOfIssue;

    }
    public String getNameBook(){
        return this.nameBook;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}

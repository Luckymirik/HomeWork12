public class Main {
    public static void main(String[] args) {
        Author kats = new Author("Максим", "Кац");
        System.out.println(kats.getNameAuthor());
        System.out.println(kats.getSurname());
        Book history = new Book("История новой России", 2020);
        System.out.println(history.getNameBook());
        System.out.println(history.getYearOfIssue());
        history.setYearOfIssue(2021);
        System.out.println(history.getYearOfIssue());


        System.out.println();

        Author tinkof = new Author("Олег", "Тиньков");
        System.out.println(tinkof.getNameAuthor());
        System.out.println(tinkof.getSurname());
        Book asEverybody = new Book("Я такой как все", 2010);
        System.out.println(asEverybody.getNameBook());
        System.out.println(asEverybody.getYearOfIssue());

    }




        }


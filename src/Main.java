public class Main {
    public static void main(String[] args) {
        Author kats =new Author("Максим", "Кац");
        Book history = new Book("История новой России",kats,2020);
        System.out.println(history.getAuthor().getNameAuthor());
        System.out.println(history.getAuthor().getSurname());
        System.out.println(history.getNameBook());
        System.out.println(history.getYearOfIssue());
        history.setYearOfIssue(2021);
        System.out.println(history.getYearOfIssue());


        System.out.println();

        Author tinkof = new Author("Олег",  "Тиньков");
        Book asEverybody = new Book("Я такой как все",tinkof, 2010);
        System.out.println(asEverybody.getNameBook());
        System.out.println(asEverybody.getYearOfIssue());
        System.out.println(asEverybody.getAuthor().getNameAuthor());
        System.out.println(asEverybody.getAuthor().getSurname());

    }




        }


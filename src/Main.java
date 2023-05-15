public class Main {
    public static void main(String[] args) {
        Author kats =new Author("Максим", "Кац");
        Book history = new Book("История новой России",kats,2020);

        history.setYearOfIssue(2021);

        System.out.println(history);
        System.out.println();

        Author tinkof = new Author("Олег",  "Тиньков");
        Book asEverybody = new Book("Я такой как все",tinkof, 2010);
        System.out.println(asEverybody);
        System.out.println();
        System.out.println(history.equals(asEverybody));
        System.out.println();
        System.out.println(history.hashCode());
        System.out.println(asEverybody.hashCode());


    }




        }


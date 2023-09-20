import java.util.ArrayList;

public class BookMain {

    public static void main(String[] args) {

        Book dune = new Book("Dune", "Frank Herbert", 1965, "Chilton Books", false);
        Book duneMessiah = new Book("Dune Messiah", "Frank Herbert", 1969, "G. P. Putnam's Sons", false);
        Book childrenOfDune = new Book("Children of Dune", "Frank Herbert", 1976, "G. P. Putnam's Sons", false);
        Book godEmperorOfDune = new Book("God Emperor of Dune", "Frank Herbert", 1981, "G. P. Putnam's Sons", false);
        Book hereticsOfDune = new Book("Heretics of Dune", "Frank Herbert", 1984, "G. P. Putnam's Sons", false);

        ArrayList<Book> books = new ArrayList<>();

        books.add(dune);
        books.add(duneMessiah);
        books.add(childrenOfDune);
        books.add(godEmperorOfDune);
        books.add(hereticsOfDune);

        for (int i = 0; i < books.size(); i++) {
            System.out.println("The " + (i + 1) + ". book is: " + books.get(i));
            if ( i == 2 ) {
                books.get(i).setPublisher("Berkley Books");
            }
            if ( i == 4 ) {
                books.get(i).setPublisher("Berkley Books");
            }
            books.get(i).setIsEbook(true);
            System.out.println("The " + (i + 1) + ". book is: " + books.get(i));
        }

    }

}

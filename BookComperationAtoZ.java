import java.util.Comparator;

public class BookComperationAtoZ implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }


    //Set<Book> bookSetByName = new TreeSet<>((book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));


}

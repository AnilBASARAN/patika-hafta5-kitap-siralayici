import java.util.*;
public class Main {

            public static void main(String[] args) {

                /*Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
                Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
                Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
                Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.*/


                // Comperator Objesi( içinde yöntemi override edilmiş)
                BookComperationAtoZ compareAtoZ = new BookComperationAtoZ();

                // Kitapları isme göre sıralayan Set
                Set<Book> bookSetByName = new TreeSet<>(compareAtoZ);

                bookSetByName.add(new Book("Lord of the rings, The fellowship", 600, "John Doe", "2010-01-01"));
                bookSetByName.add(new Book("Two Towers", 500, "Jane Doe", "2015-02-01"));
                bookSetByName.add(new Book("Return of the King", 400, "Anonymus", "2020-03-01"));
                bookSetByName.add(new Book("Web Development", 300, "Bob Marley", "2025-04-01"));
                bookSetByName.add(new Book("Algorithms", 200, "Patika DEV", "2030-05-01"));

                System.out.println("Books sorted by name:");
                for (Book book : bookSetByName) {
                    System.out.println(book);
                }



                // Kitapları sayfa sayısına göre sıralayan Set ve Comperator Objesi
                BookComperationByPageNumber compareByPageNums = new BookComperationByPageNumber();
                Set<Book> bookSetByPageCount = new TreeSet<>(compareByPageNums);



                bookSetByPageCount.addAll(bookSetByName);

                System.out.println("\nBooks sorted by page count:");
                for (Book book : bookSetByPageCount) {
                    System.out.println(book);
                }
            }
        }

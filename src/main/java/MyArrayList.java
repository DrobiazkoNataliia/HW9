import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<String>();

        books.add("On the Road");
        books.add("Ulysses");
        books.add("The Hitchhiker's Guide to the Galaxy");
        books.add("Faust");
        books.add("Fahrenheit 451");
        books.add("One hundred years of loneliness");
        books.add("The Little Prince");

        for (String title : books) {
            System.out.println("The title of the book is " + title);
        }

        System.out.println("The size of the collection is " + books.size());

        System.out.println("We will remove the element - " + books.get(2));

        books.remove(2);

        System.out.println(books);

        books.clear();
        System.out.println("Now the size of the collection is " + books.size());

    }
}


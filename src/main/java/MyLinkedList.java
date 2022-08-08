import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        String str1 = new String("Life on loan");
        String str2 = new String("Three Comrades");
        String str3 = new String("Shadows in Paradise");
        String str4 = new String("The Night in Lisbon");
        String str5 = new String("The Black Obelisk");

        LinkedList<String> remarquesBooks = new LinkedList<>();
        remarquesBooks.add(str1);
        remarquesBooks.add(str2);
        remarquesBooks.add(str3);
        remarquesBooks.add(str4);
        remarquesBooks.add(str5);

        System.out.println(remarquesBooks);

        System.out.println(remarquesBooks.getLast());

        remarquesBooks.removeLast();

        System.out.println("The size is " + remarquesBooks.size());

        remarquesBooks.clear();
    }
}

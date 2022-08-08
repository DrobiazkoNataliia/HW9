import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {

        Queue<String> cities = new ArrayDeque<>();

        cities.add("Kyiv");
        cities.add("Krakow");
        cities.add("Ottawa");
        cities.add("Antananarivo");
        cities.add("Vilnius");

        cities.remove();

        System.out.println("Now the first element has become " + cities.peek());

        while(cities.peek() != null) {
            System.out.println(cities.poll());
        }

        System.out.println(cities.size());

        cities.add("Prague");
        cities.add("Dublin");

        cities.clear();
    }
}


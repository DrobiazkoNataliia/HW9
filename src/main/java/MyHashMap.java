import java.util.*;

public class MyHashMap {
    public static void main(String[] args) {

        Map<String, Integer> diametersPlanets = new HashMap<String, Integer>();
        diametersPlanets.put("Mercury", 4860);
        diametersPlanets.put("Venus", 9226);
        diametersPlanets.put("Earth", 12756);
        diametersPlanets.put("Mars", 19546);
        diametersPlanets.put("Jupiter", 66338);
        diametersPlanets.put("Saturn", 116820);
        diametersPlanets.put("Uranus", 244660);
        diametersPlanets.put("Neptune", 382680);

        System.out.println(diametersPlanets.get("Uranus"));

        diametersPlanets.remove("Neptune");

        System.out.println(diametersPlanets.size());

        diametersPlanets.clear();

    }
}

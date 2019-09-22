package by.belhard.kids_pro.les9.hw.task3;

import by.belhard.kids_pro.les9.hw.task2.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<Entity, List<String>> map
            = new HashMap<>();

    static {
        Entity vasily = new Entity("Vasily");
        Entity petr = new Entity("Petr");
        Entity ivan = new Entity("Ivan");
        Entity olga = new Entity("Olga");

        List<String> vasilyList = new ArrayList<>() {{
            add("bread");
            add("bread");
            add("milk");
        }};

        List<String> petrList = new ArrayList<>() {{
            add("bread");
            add("milk");
            add("butter");
        }};

        List<String> ivanList = new ArrayList<>() {{
            add("butter");
            add("chocolate");
        }};

        List<String> olgaList = new ArrayList<>() {{
            add("bread");
            add("chocolate");
            add("milk");
        }};

        map.put(vasily, vasilyList);
        map.put(petr, petrList);
        map.put(ivan, ivanList);
        map.put(olga, olgaList);
    }

    public static void main(String[] args) {

        Map<String, Integer> result = new HashMap<>();

        for (List<String> list : map.values()) {
            for (String s : list) {
                if (result.containsKey(s)) {
                    result.put(s, result.get(s) + 1);
                } else {
                    result.put(s, 1);
                }
            }
        }

        result.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

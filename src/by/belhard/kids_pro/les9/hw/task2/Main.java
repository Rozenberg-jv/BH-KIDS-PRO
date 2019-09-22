package by.belhard.kids_pro.les9.hw.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    private static final List<Entity> list = new ArrayList<>();

    static {
        list.add(new Entity("name1"));
        list.add(new Entity("name2"));
        list.add(new Entity("name3"));
        list.add(new Entity("name4"));
        list.add(new Entity("name5"));
    }

    public static void main(String[] args) {

        Entity result = getByNameFromList("name6");

        System.out.println(result);

        Entity result2 = getByNameWithStream("name6");

        System.out.println(result2);
    }

    private static Entity getByNameFromList(String name) {

        for (Entity e : list) {
            if (e.getName().equals(name))
                return e;
        }

        return null;
    }

    private static Entity getByNameWithStream(String name) {

        Optional<Entity> opt = list.stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst();

        return opt.orElse(null);
    }
}

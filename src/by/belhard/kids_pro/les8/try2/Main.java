package by.belhard.kids_pro.les8.try2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Animal animal1 = new Animal("animal");
        Animal animal2 = new GroundAnimals("Hare", 4);
        Animal animal3 = new FlyingAnimals("Pinguin");

//        animal1.move();
        animal2.move();
        animal3.move();

        List<Animal> list = new ArrayList<>();

        list.add(animal2);
        list.add(animal3);

        for (Animal a : list)
            a.move();

    }
}

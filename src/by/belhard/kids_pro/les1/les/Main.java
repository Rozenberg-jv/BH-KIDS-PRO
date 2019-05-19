package by.belhard.kids_pro.les1.les;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Workable> list = new ArrayList<>();

        Person person = new Person();
        person.a();

        Worker worker = new Worker();

        list.add(person);
        list.add(worker);

        Workable workable = person;
        workable.work();
        workable = new Person();
        workable.work();

        workable = worker;
        workable.work();



    }
}

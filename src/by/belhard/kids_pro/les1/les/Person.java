package by.belhard.kids_pro.les1.les;

public class Person implements Workable{

    @Override
    public void work() {
        System.out.println("Я ничего не умею делать");
    }

    public void a() {
        System.out.println("a");
    }
}

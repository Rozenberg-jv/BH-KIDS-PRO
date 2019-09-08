package by.belhard.kids_pro.les8.try2;

public class FlyingAnimals extends Animal implements Flyable {

    public FlyingAnimals(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this + " is flying");
    }

    @Override
    public void sitAtEgg() {
        System.out.println(this + " is sitting at egg");
    }

    @Override
    public String toString() {
        return super.toString() + " [isFlying]";
    }
}

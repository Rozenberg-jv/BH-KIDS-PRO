package by.belhard.kids_pro.les8.try2;

public class GroundAnimals extends Animal {

    private int legsNumber;

    public GroundAnimals(String name, int legsNumber) {
        super(name);

        this.legsNumber = legsNumber;
    }

    @Override
    public void move() {
        System.out.println(this + " is walking");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "legsNumber=" + legsNumber +
                '}';
    }
}

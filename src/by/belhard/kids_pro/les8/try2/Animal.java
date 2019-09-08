package by.belhard.kids_pro.les8.try2;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();

    @Override
    public String toString() {
        return name;
    }
}

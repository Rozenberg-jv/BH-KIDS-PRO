package by.belhard.kids_pro.les9.hw.task2;

public class Entity {

    private String name;

    public Entity(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

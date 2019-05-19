package by.belhard.kids_pro.les2;

public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("Вызван конструктор класса Person " +
                "с параметрами name=%s, age=%d\n", name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void growOld() {
        this.age++;
    }

    public abstract void doWork();

    @Override
    public String toString() {
        return "name='" + name + "\', age=" + age;
    }
}

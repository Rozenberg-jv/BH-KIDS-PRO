package by.belhard.kids_pro.les2;

public class Worker extends Person {

    private String instrument;

    public Worker(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
        System.out.printf("Вызван конструктор класса Worker " +
                "с параметрами instrument=%s\n", instrument);
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void doWork() {
        System.out.println("Work with " + this.instrument);
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() + ", instrument='" + instrument + "'}";
    }
}

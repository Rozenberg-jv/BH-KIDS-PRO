package by.belhard.kids_pro.les2;

public class Manager extends Person {

    private String phoneNumber;

    public Manager(String name, int age, String phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
        System.out.printf("Вызван конструктор класса Worker " +
                "с параметрами phoneNumber=%s\n", phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Call me to " + this.phoneNumber);
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                ", phoneNumber='" + phoneNumber + "'}";
    }
}

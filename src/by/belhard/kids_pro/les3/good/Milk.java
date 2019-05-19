package by.belhard.kids_pro.les3.good;

public class Milk extends FoodGood {

    private double fat;

    public Milk(String name, int price, double fat) {
        super(name, price);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Milk{" + super.toString() +
                "fat=" + fat +
                '}';
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}

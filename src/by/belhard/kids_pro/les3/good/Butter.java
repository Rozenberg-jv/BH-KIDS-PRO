package by.belhard.kids_pro.les3.good;

public class Butter extends FoodGood {

    private double tverdost;

    public Butter(String name, int price, double tverdost) {
        super(name, price);
        this.tverdost = tverdost;
    }

    public double getTverdost() {
        return tverdost;
    }

    public void setTverdost(double tverdost) {
        this.tverdost = tverdost;
    }

    @Override
    public String toString() {
        return "Butter{" + super.toString() +
                "tverdost=" + tverdost +
                '}';
    }
}

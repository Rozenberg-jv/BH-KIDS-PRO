package by.belhard.kids_pro.les3.good;

public class Ball extends SportsGood {

    private String material;

    @Override
    public String toString() {
        return "Ball{" + super.toString() +
                "material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Ball(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }
}

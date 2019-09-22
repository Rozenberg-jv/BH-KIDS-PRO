package by.belhard.kids_pro.les9.hw.task4.sellable.services;

public class ManService extends Service{

    private final boolean manOnly;

    public ManService(String title, int cost, double timePerProcedure, boolean manOnly) {
        super(title, cost, timePerProcedure);
        this.manOnly = manOnly;
    }

    @Override
    public String toString() {
        return "ManService{" +
                "manOnly=" + manOnly +
                "} " + super.toString();
    }
}

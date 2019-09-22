package by.belhard.kids_pro.les9.hw.task4.sellable.services;

public class PetService extends Service {

    private final PetType petType;

    public PetService(String title, int cost, double timePerProcedure, PetType petType) {
        super(title, cost, timePerProcedure);
        this.petType = petType;
    }

    @Override
    public String toString() {
        return "PetService{" +
                "petType=" + petType +
                "} " + super.toString();
    }
}

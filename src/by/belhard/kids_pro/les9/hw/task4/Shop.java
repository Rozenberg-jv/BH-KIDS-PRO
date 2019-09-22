package by.belhard.kids_pro.les9.hw.task4;

import by.belhard.kids_pro.les9.hw.task4.sellable.Sellable;
import by.belhard.kids_pro.les9.hw.task4.sellable.goods.FoodGood;
import by.belhard.kids_pro.les9.hw.task4.sellable.goods.FoodGoodType;
import by.belhard.kids_pro.les9.hw.task4.sellable.goods.SportGood;
import by.belhard.kids_pro.les9.hw.task4.sellable.goods.SportGoodType;
import by.belhard.kids_pro.les9.hw.task4.sellable.services.ManService;
import by.belhard.kids_pro.les9.hw.task4.sellable.services.PetService;
import by.belhard.kids_pro.les9.hw.task4.sellable.services.PetType;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    private final Map<String, Sellable> assortment =
            new HashMap<>();

    {
        FoodGood milk = new FoodGood("milk", 2, LocalDate.of(2019, 9, 20), FoodGoodType.MILK);
        FoodGood whale = new FoodGood("whale", 15, LocalDate.of(2019, 8, 2), FoodGoodType.FISH);
        SportGood tennisBall = new SportGood("tennis ball", 1,
                LocalDate.of(2017, 5, 29), SportGoodType.TENNIS);

        ManService beardCutting = new ManService("beard cutting", 10, 0.5, true);
        ManService massage = new ManService("massage", 15, 0.75, false);
        PetService hostel = new PetService("hostel", 10, 3, PetType.DOG);

        assortment.put(milk.getTitle(), milk);
        assortment.put(whale.getTitle(), whale);
        assortment.put(tennisBall.getTitle(), tennisBall);
        assortment.put(beardCutting.getTitle(), beardCutting);
        assortment.put(massage.getTitle(), massage);
        assortment.put(hostel.getTitle(), hostel);
    }

    private Busket busket;

    public Busket getNewBusket() {

        this.busket = new Busket();

        return this.busket;
    }

    public void addToBusket(String title) {

        if (assortment.containsKey(title))
            this.busket.putIntoBasket(assortment.get(title));
        else
            System.out.println("No such good or service!");
    }
}

package by.belhard.kids_pro.les9.hw.task4;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Busket newBusket = shop.getNewBusket();

        shop.addToBusket("milk");
        shop.addToBusket("milk");

        shop.addToBusket("beard cutting");
        shop.addToBusket("hostel");
        shop.addToBusket("PC");

        System.out.println(newBusket.getCost());
    }
}

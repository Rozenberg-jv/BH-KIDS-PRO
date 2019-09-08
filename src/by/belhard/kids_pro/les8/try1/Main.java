package by.belhard.kids_pro.les8.try1;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(3000, 5000, 2500, FloorMaterial.LAMINAT);
        Room room2 = new Room(3500, 4000, 2700);

        System.out.println(room1);

        room1.addWindow(1000, 1500);
        room1.addWindow(1000, 1500);
        room1.setFloorMaterial(FloorMaterial.CAFEL);

        System.out.println(room1);

    }
}

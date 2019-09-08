package by.belhard.kids_pro.les8.try1;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private final int length, width, height;

    private FloorMaterial floorMaterial;

    private List<Window> windows = new ArrayList<>();

    public Room(int length, int width, int height, FloorMaterial floorMaterial) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.floorMaterial = floorMaterial;
    }

    public Room(int length, int width, int height) {
        this(length, width, height, FloorMaterial.values()[0]);
    }

    public void addWindow(int width, int height) {
        this.windows.add(new Window(width, height));
    }

    public void setFloorMaterial(FloorMaterial floorMaterial) {
        this.floorMaterial = floorMaterial;
    }

    @Override
    public String toString() {
        return String.format("Room{%dx%dx%d - %s - windows: %d}",
                length, width, height, floorMaterial, windows.size());
    }
}

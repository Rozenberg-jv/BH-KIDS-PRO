package by.belhard.kids_pro.les9.hw.task4.sellable.services;

import by.belhard.kids_pro.les9.hw.task4.sellable.Sellable;

import java.util.Objects;

public abstract class Service implements Sellable {

    private final String title;

    private final int cost;

    private final double timePerProcedure;

    public Service(String title, int cost, double timePerProcedure) {
        this.title = title;
        this.cost = cost;
        this.timePerProcedure = timePerProcedure;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public double getTimePerProcedure() {
        return timePerProcedure;
    }

    @Override
    public String toString() {
        return String.format("%s, %d p. for %f hours", title, cost, timePerProcedure);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return title.equals(service.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}

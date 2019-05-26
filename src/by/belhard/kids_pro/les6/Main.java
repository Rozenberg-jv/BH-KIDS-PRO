package by.belhard.kids_pro.les6;

import by.belhard.kids_pro.les6.battlegame.*;

public class Main {

    public static void main(String[] args) {

        Weapon sword = new Weapon("Sword", 2, 5);
        Weapon bow = new Weapon("Bow", 1, 6);
        Weapon staff = new Weapon("Staff", 1, 3);

        AbstractUnit knight = new Knight("Knight", 40, 10, sword);
        AbstractUnit archer = new Archer("Archer", 30, 5, bow);
        AbstractUnit mage = new Mage("Mage", 30, 3, staff);

        Battleground battle = new Battleground();
        battle.setUnit1(mage);
        battle.setUnit2(archer);

        battle.startBattle();

    }
}

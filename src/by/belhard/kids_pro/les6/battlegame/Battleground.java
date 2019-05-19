package by.belhard.kids_pro.les6.battlegame;

public class Battleground {

    private AbstractUnit unit1, unit2;

    public void startBattle() {
        if (unit1 == null || unit2 == null) {
            System.out.println("нет одного из противников");
            return;
        }

        AbstractUnit currentUnit = RandomUtil.random(2) == 0 ? unit1 : unit2;
        AbstractUnit target = currentUnit == unit1 ? unit2 : unit1;
        AbstractUnit tmp;

        while (unit1.getCurrentHealth() > 0 && unit2.getCurrentHealth() > 0) {
            currentUnit.attack(target);

            // poison handle

            tmp = target;
            target = currentUnit;
            currentUnit = tmp;
        }
    }

    public AbstractUnit getUnit1() {
        return unit1;
    }

    public void setUnit1(AbstractUnit unit1) {
        this.unit1 = unit1;
    }

    public AbstractUnit getUnit2() {
        return unit2;
    }

    public void setUnit2(AbstractUnit unit2) {
        this.unit2 = unit2;
    }
}

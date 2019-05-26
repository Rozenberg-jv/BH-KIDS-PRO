package by.belhard.kids_pro.les6.battlegame;

public class Battleground {

    private AbstractUnit unit1, unit2;
    private int round = 1;

    public void startBattle() {
        if (unit1 == null || unit2 == null) {
            System.out.println("нет одного из противников");
            return;
        }

        AbstractUnit currentUnit = RandomUtil.random(2) == 0 ? unit1 : unit2;
        AbstractUnit target = currentUnit == unit1 ? unit2 : unit1;
        AbstractUnit tmp;

        while (unit1.getCurrentHealth() > 0 && unit2.getCurrentHealth() > 0) {
            System.out.printf("\nRound %d\n", round++);

            int dealtDamage = currentUnit.attack(target);

            System.out.printf("%s deal %d to %s\n",
                    currentUnit.getName(), dealtDamage, target.getName());

            // poison handle
            currentUnit.handlePoisons();

            tmp = target;
            target = currentUnit;
            currentUnit = tmp;

            System.out.printf("[%s: %d]  [%s: %d]\n",
                    unit1.getName(), unit1.getCurrentHealth(),
                    unit2.getName(), unit2.getCurrentHealth());
        }

        // winner output
        if (unit1.getCurrentHealth() > 0) {
            System.out.println("Winner is " + unit1.getName());
        } else {
            System.out.println("Winner is " + unit2.getName());
        }

        System.out.println("Results: " + unit1.getCurrentHealth() + ":" + unit2.getCurrentHealth());
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

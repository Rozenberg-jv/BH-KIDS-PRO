package by.belhard.kids_pro.les6.battlegame;

import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();

    public static int random(int bound) {
        return random.nextInt(bound);
    }
}

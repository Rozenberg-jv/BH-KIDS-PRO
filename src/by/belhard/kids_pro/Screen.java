package by.belhard.kids_pro;

import java.util.Scanner;

public class Screen {

    private static Scanner scanner = new Scanner(System.in);

    public static void print(String str) {
        System.out.println(str);
    }

    public static String getMainMenu() {
        return "1. положить деньги на счет\n" +
                "2. снять наличные\n" +
                "3. перевести деньги\n" +
                "0. выйти\n";
    }

    public static String getInput() {
        return scanner.nextLine();
    }
}

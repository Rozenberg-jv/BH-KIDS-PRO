package by.belhard.kids_pro.les8.try3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            for (; ; ) {
                input = rdr.readLine();

                if (input.equals("exit")) break;

                System.out.println(toUpper(input));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String toUpper(String input) {
        return input.toUpperCase();
    }
}

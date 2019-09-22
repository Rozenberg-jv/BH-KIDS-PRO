package by.belhard.kids_pro.les9.hw.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add(".");
        list.add("");
        list.add("abcde");
        list.add("ccc");
        list.add("ddddddd");

        StringBuilder sb = new StringBuilder();
        String tmp;

        /*for (int i = 0; i < list.size(); i++) {

            tmp = list.get(i);
            if (tmp.length() < 5)
                sb.append(tmp).append(" ");
        }*/

        /*for (String s : list) {
            if (s.length() < 5)
                sb.append(s).append(" ");
        }*/

        //        System.out.println(sb.toString().trim());

        /*new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 5;
            }
        }*/

        String result = list.stream().filter(s -> s.length() < 5)
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }
}

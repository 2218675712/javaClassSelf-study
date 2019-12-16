package day1216;

import java.util.ArrayList;

public class test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小黑");
        list.add("小王");
        list.add("小刘");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(name);
            } else {
                System.out.print(name + "@");
            }
        }
        System.out.print("}");
    }
}

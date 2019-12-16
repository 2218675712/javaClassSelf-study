/*
 * 时间:2019年12月16日22:14:37
 * 目的:生成6个1~33之间的随机数,添加到集合,并遍历集合
 * */
package day1216;

import java.util.ArrayList;
import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

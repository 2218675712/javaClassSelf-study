/*
 * 时间:2019年12月6日19:22:14
 * 目的:学习随机数类
 * */
package day1206;

import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        for (int i = 0; i < 9; i++) {
            a = random.nextInt(2)+1;
            System.out.println(a);
        }
    }
}

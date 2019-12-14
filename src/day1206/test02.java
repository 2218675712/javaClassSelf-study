/*
 * 时间:2019年12月6日19:26:49
 * 目的:练习猜数字小游戏
 * ------------------------
 *
 * ------------------------
 * */
package day1206;

import java.util.Random;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

//        产生随机数字
        int random = r.nextInt(20) + 1;
        System.out.println("欢迎来到猜数游戏");
        System.out.println("请输入一个数字,范围1~20");
        while (true) {
            int num = scanner.nextInt();
            if (num > random) {
                System.out.println("猜大了,请重猜");

            } else if (num < random) {
                System.out.println("猜小了,请重猜");
            } else {
                System.out.println("恭喜猜对了");
                break;
            }
        }
    }
}

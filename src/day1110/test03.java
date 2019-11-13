/*
 * 时间:   2019年11月10日13:41:38
 * 目的:   定义一个方法,打印指定次数的helloWorld
 *
 * */
package day1110;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入几次helloWorld:");
        int x = scanner.nextInt();
        getPrint(x);
    }

    public static void getPrint(int x) {
        for (var i = 0; i < x; i++) {
            System.out.println("helloWorld" + (i + 1) + "次");
        }
    }
}

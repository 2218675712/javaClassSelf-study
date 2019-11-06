/*
 * 时间:2019年11月6日11:36:56
 * 目的:购物金额结算
 *
 * */
package day1106;

import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] jinE = new double[5];
        double zongJinE = 0.0;

        //获取金额
        for (int i = 0; i < jinE.length; i++) {
            System.out.println("请输入第" + (i + 1) + "笔购物金额");
            jinE[i] = scanner.nextDouble();
            zongJinE += jinE[i];
        }

        //显示序号,金额
        System.out.println("序号\t\t金额(元)");
        for (int i = 0; i < jinE.length; i++) {
            System.out.println((i + 1) + "\t\t" + jinE[i]);
        }
        System.out.println("总金额" + "\t\t" + zongJinE);


    }
}

/*
* 时间:2019年11月6日10:46:08
* 目的:学习数组
* 结果:
* */
package day1106;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        //数组声明,填入数组长度
        double score[] = new double[5];


        for (int i = 0; i < score.length; i++) {
            System.out.println("请输入第" + (i + 1) + "名的成绩");
            score[i] = scanner.nextDouble();
            sum += score[i];
        }
        System.out.println("平均分是" + sum / score.length);

    }
}

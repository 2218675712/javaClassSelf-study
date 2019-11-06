/*
* 时间:2019年11月6日23:05:23
* 目的:冒泡
* 结果:失败
*
*
* */
package day1106;

import javax.xml.stream.XMLOutputFactory;

public class text02 {
    public static void main(String[] args) {
        int num[] = {5, 34, 64, 21, 1};
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            System.out.println(num[i]);
        }
    }
}

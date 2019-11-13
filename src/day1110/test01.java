/*
 * 时间:  2019年11月10日13:31:27
 * 目的:   定义一个方法,判断两个数字是否相等
 *

 * */
package day1110;

public class test01 {
    public static void main(String[] args) {
        boolean result = isEqual(10, 10);
        System.out.println(result);
    }

    public static boolean isEqual(int a, int b) {
        return a == b;
    }
}

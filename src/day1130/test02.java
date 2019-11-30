
/**
 * 时间:2019年11月30日16:16:40
 * 目的:java返回数组
 */
package day1130;

public class test02 {
    public static void main(String[] args) {
        //地址
        System.out.println(Calc(1, 2, 3));
        //数据
        System.out.println(Calc(1, 2, 3)[0]);
    }

    public static int[] Calc(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] arr = {sum, avg};
        return arr;
    }
}

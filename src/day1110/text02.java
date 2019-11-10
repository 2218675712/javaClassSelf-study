/*
 * 时间:   2019年11月10日13:35:50
 * 目的:   求1-100的和
 *
 * */
package day1110;

public class text02 {
    public static void main(String[] args) {
        System.out.println("结果是" + getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}

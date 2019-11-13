/*
 * 时间:   2019年11月10日14:07:18
 * 目的:   方法重载(overload)
 *对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦。
 * 多个方法的名称一样，但是参数列表不一样。
 *好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能。
 *
 * */
package day1110;

public class test04 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

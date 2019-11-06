/*
 * 时间：   2019年11月5日22:38:05
 * 目的：
 * 结果：
 *
 *
 * */
package day1105;

public class text01 {
    public static void main(String[] args) {
        int a=160;
        int b=76;
        //三元运算符
        int max=a>b?a:b;
        System.out.println(max);
        if (a>b){
            max=a;
        }else {
            max=b;
        }
        System.out.println(max);

    }
}

/*
 * 时间:2019年12月4日21:57:00
 * 目的:面向对象,面向过程
 * -----------------------
 * 面向对象:找人做事
 * 面向过程:亲力亲为
 * -----------------------
 */
package day1204;

import java.util.Arrays;

public class test02 {
    public static void main(String[] args) {
        //打印数组[10,20,30]
        int[] arr = {10, 20, 30};

        //面向过程
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }

        //面向对象
        System.out.println(Arrays.toString(arr));
    }
}

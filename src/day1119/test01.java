/*
 * 时间:2019年11月20日00:06:40
 * 目的:空指针
 *
 * */
package day1119;

public class test01 {
    public static void main(String[] args) {
        int[] arr = null;
        arr = new int[1];
        System.out.println(arr[0]);
    }

}

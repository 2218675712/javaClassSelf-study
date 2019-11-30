/**
 * 时间:2019年11月30日15:49:47
 * 目的:数组反转
 */
package day1130;

public class test01 {
    //打印方法
    public  static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int temp;
        print(arr);
        System.out.println("-------------------");
        //第一种方式
        /*
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
*/

        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        print(arr);
    }
}

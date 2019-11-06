package day1106;

import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        int[] arr = {8,4,2,1,23,344,12};
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean zhuangTai=false;
        System.out.println("请输入一个数");
        num = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                zhuangTai=true;
                break;
            }

        }
        if (zhuangTai){
            System.out.println("有");
        }else {
            System.out.println("没有");
        }

    }
}

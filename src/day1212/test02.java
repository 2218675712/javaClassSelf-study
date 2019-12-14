package day1212;

import day1203.Person;

public class test02 {
    public static void main(String[] args) {
        test02[] arrs=new test02[3];
        test02 one=new test02();
        test02 two=new test02();
        test02 three=new test02();
        arrs[0]=one;
        arrs[1]=two;
        arrs[2]=three;
        System.out.println(arrs[0]);
        System.out.println(arrs[1]);
        System.out.println(arrs[2]);
    }
}

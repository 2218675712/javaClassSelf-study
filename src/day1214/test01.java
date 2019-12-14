/*
 * 时间:2019年12月14日14:07:26
 *目的:ArrayList集合概述和基本使用
 * */

package day1214;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
//        创建一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();
//        添加一个字符串(add添加方法)
        list.add("小明");
        list.add("小红");
        list.add("小刚");
        System.out.println(list);
    }
}

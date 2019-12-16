/*
 * 时间:2019年12月16日22:34:43
 * 目的:自定义四个对象,添加到集合,并遍历
 * */
package day1216;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("小一", 1);
        Student two = new Student("小二", 2);
        Student three = new Student("小三", 3);
        Student four = new Student("小四", 4);
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名" + stu.getName() + "年龄" + stu.getAge());
        }
    }
}

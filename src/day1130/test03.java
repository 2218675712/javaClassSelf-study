/*
 * 时间:2019年11月30日16:47:34
 * 目的:private关键字定义
 *   private私有的,只有自己可以使用
 *  这样写如果用户输入不合法数据,可以不让赋值
 * */
package day1130;

public class test03 {
    String name;
    //加private就是私有的
    private int age;

    public void Show() {
        System.out.println("我叫" + name + age + "岁");
    }

    public void setAge(int num) {
        if (num >= 9 && num <= 100) {
            age = num;
        } else {
            System.out.println("输入数据错误");
        }
    }

    public int getAge() {
        return age;
    }
}

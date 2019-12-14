/*
 * 时间:2019年12月14日14:35:25
 * 目的:ArrayList集合常用方法
 * 结果:
 * ---------------------------------
 * 1.add()添加,有返回值,为boolean类型,添加是否成功
 * 2.get()查找,括号里添索引编号
 * 3.remove()删除,括号里填写索引编号
 * 4.size()长度,返回包含元素个数
 *
 * ---------------------------------
 *
 * */
package day1214;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小红");
        list.add("王华");
        list.add("潘长江");
        list.add("李丽");
//        查找王华
        String find = list.get(2);
        System.out.println(find);
//        删除潘长江
        list.remove(3);
//        list.remove("潘长江");
//        拿到list集合长度
        System.out.println(list);
        int num = list.size();
        System.out.println(num);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

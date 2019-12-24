package day1224.test01;

public class test01 {
    public static void main(String[] args) {
        /*
        *访问变量的两种方式:
        *   1.直接通过对象名称访问成员变量:看等号左边是谁,优先使用谁,没有则向上找
        *   2.间接通过成员方法访问成员变量:看该方法属于谁,优先用谁,没有则向上找
        *
        * */
        Fu obj=new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);      //拿不到

//        -------------------------------------------------------
        obj.showNum();

    }
}

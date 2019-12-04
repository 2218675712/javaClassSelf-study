/**
 * 时间:2019年12月3日23:10:42
 * 目的:this学习
 *      通过谁调用的方法,谁就是this
 */
package day1203;

public class Person {
    String name;
    public void sayHello(String name){
        System.out.println(name+"你好,我是"+this.name);
    }
}

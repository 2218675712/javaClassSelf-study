/*
 * 时间:   2019年11月9日19:45:07
 * 目的:   复习方法
 *
 *定义格式
 * public static void (){
 *       方法体
 * }
 *调用格式
 * 方法格式();
 *
 * */
/*
 * 定义方法的完整格式
 * 修饰符 返回值类型 方法名称(参数类型 参数名称,...){
 *       方法体 返回值;
 *
 * }
 *
 *修饰符:现阶段的写法:
 *返回值类型:也就是方法最终产生的数据结果是什么类型
 * 方法名称:方法的名字
 * 参数名称:进入方法的数据是什么类型
 * PS:参数如果有多个,使用逗号进行分割
 * 方法体:方法需要做的事
 * return:两个作用:第一停止当前的方法;第二将后面的返回值还给调用处
 * 返回值:也就是方法执行后最终产生的结果
 *
 * */
package day1109;

public class text01 {
    public static void main(String[] args) {
        System.out.println(qiuHe(10, 20));
    }

    public static int qiuHe(int a, int b) {
        return a + b;
    }

}

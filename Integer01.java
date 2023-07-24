package com.jtl.wrapper;

/**
 * @author 蒋天乐
 * java学习用
 */
public class Integer01 {
    public static void main(String[] args) {
        //int和Integer 的装箱和拆箱
        //手动装箱（jdk5以前）
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱 Integer -> int
        int i = integer.intValue();

        //自动装箱（jdk5后）int -> Integer
        int n2 = 200;
        Integer integer2 = n2;//底层使用的还是 Integer.valueOf(n2)
        //自动拆箱 Integer -> int
        int n3 = integer2;//底层使用的还是 integer.intValue()


        //题目：
        //注意这里三元运算符是一个整体，表达式里面最高精度为double，所以输出1.0而不是1(非常容易错啊)
        Object obj = true ? new Integer(1) : new Double(2.0);
        System.out.println(obj);//输出1.0

    }
}

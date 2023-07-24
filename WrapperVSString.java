package com.jtl.wrapper;

/**
 * @author 蒋天乐
 * java学习用
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类(Integer)-》String
        Integer i = 100;//自动装箱
        //1.
        String str1 = i + "";;
        //2.
        String str2 = i.toString();
        //3.
        String str3 = String.valueOf(i);

        //String -> 包装类（Integer）
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);//自动装箱
        Integer i3 = new Integer(str4);//构造器
    }
}

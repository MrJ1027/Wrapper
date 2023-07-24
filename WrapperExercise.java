package com.jtl.wrapper;

/**
 * @author 蒋天乐
 * java学习用
 */
public class WrapperExercise {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        //这里new两个对象，肯定不一样
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        //看底层源码，知道这里主要看范围 -128 - 127就是直接返回，
        //否则就new Integer(xx);
        /*
        //解读:1.如果 i 在  Integer.IntegerCache.low（-128） 和 Integer.IntegerCache.high（127）
        //范围内，就直接从缓存数组里面返回
        //2.如果不在-128 - 127,就直接new Integer(i)
        public static Integer valueOf(int i) {
            if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
                return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
            return new Integer(i);
        }
         */
        Integer m = 1;//Integer.valueOf(1)
        Integer n = 1;
        System.out.println(m == n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
        //只要有基本数据类型，==操作符就是判断值是否相等
        Integer aa = 127;
        int aa2 = 127;
        System.out.println(aa == aa2);
    }
}

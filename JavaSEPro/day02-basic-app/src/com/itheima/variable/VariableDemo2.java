package com.itheima.variable;

import org.w3c.dom.ls.LSOutput;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标： 掌握基本数据类型的使用
        // 1、byte short int long
        byte a1 = 127; // 范围： -128 - 127
        // byte a2 = 128; 超出范围

        short s1 = 13244;
        // short s2 = 93244; 超出范围

        int i = 422424; // 整数数据默认数据类型为int

        // 注意： 随便写一个整型字面量默认是int类型，424242244444虽然没有超出long的范围，但是超过了int类型的范围
        // 如果希望随便写一个整型字面量默认是long类型，需要在后面加上L / l
        long lg = 424242244444L;

        // 2、float double
        // 注意： 随便写小数字面量，默认是double，如果希望小数是float，需要在后面加上F / f
        float f = 3.14F;

        double d = 56.45;

        // 3、char 字符型
        char ch1 = 'a';
        char ch2 = '中';
        // char ch3 = ''; 不能为空字符

        // 4、boolean
        boolean flag1 = true;
        boolean flag2 = false;

        // 拓展一种引用数据类型，后面要用
        // String 字符串类型，定义的变量可以用于记住一个字符串数据
        String name = "张三";
        System.out.println(name);
    }
}

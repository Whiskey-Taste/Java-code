package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        // 目标： 搞清楚使用变量时的注意事项
        // 1、变量要先声明才能使用
        int age = 18;
        System.out.println(age);

        // 2、什么类型的变量，只能存储什么类型的数据
        // age = 9.8;
        // 3、变量存在访问范围，同一个范围内，多个变量的名字不能一样
        {
            int a = 19;
            // int a = 23;
            System.out.println(a);
        }
        // System.out.println(a);
        System.out.println(age);
        int a = 23;
        //  int age = 25;

        // 4、变量定义时可以不给赋初始值；但是在使用时，变量里必须有值
        int number;
        number = 100;
        System.out.println(number);

        int b = 10;
    }
}

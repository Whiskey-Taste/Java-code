package com.itheima.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 基本赋值运算符： =(从右边往左看)


        // 目标： 掌握扩展赋值运算符的使用
        // 扩展赋值运算符自带强制类型转换
        // 底层代码形式 a = (a的类型)(a +-*/% b)
        // += 加后赋值
        // 实现数据累加，把别人的数据加给自己
        // 需求： 收红包
        double a = 9.5;
        double b = 520;
        a += b; // a = (double)(a + b);
        System.out.println(a);

        // -= 减后赋值
        // 需求： 发红包
        double i = 600;
        double j = 520;
        i -= j; // i = (double)(i - j);
        System.out.println(i);

        // *= 乘后赋值、/= 除后赋值、%= 取余后赋值
        int m = 10;
        int n = 5;
        // m *= n; // 等价形式：m = (int)(m * n)
        // m /= n; // 等价形式：m = (int)(m / n)
        m %= n;    // 等价形式：m = (int)(m % n)
        System.out.println(m);

        System.out.println("------------------------");

        byte x = 10;
        byte y = 30;
        // x = x + y; // 编译报错
        // x = (byte)(x + y);
        x += y; // 等价形式：x = (byte)(x + y);
        System.out.println(x);
    }
}

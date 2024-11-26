package com.itheima.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {
        // 目标： 掌握强制类型转换
        // 默认情况下，大范围类型的变量直接赋值给小范围类型的变量会报错
        // 可以强行将类型范围大的变量、数据赋值给类型范围小的变量
        // 数据类型 变量 = （数据类型）变量、数据
        int a = 20;
        // byte b = a; 报错
        byte b = (byte) a; // Alt + Enter 强制类型转换
        // 强制类型转换再计算机中的执行原理
        // a 00000000 00000000 00000000 00010100 32位
        //                            b 00010100 8位 第一位是0 -> 正数
        System.out.println(a);
        System.out.println(b); // 20

        int i = 1500;
        // byte j = i; 报错
        // i 00000000 00000000 00000101 10011100 32位
        //                            j 10011100 8位 第一位是1 -> 负数
        byte j = (byte) i;
        System.out.println(j); // -36
        // 注意： 强制类型转换可能造成数据（丢失）溢出

        double d = 99.5;
        int m = (int) d;
        System.out.println(m); // 99
        // 浮点型强转成整型，直接丢掉小数部分，保留整数部分返回


    }
}

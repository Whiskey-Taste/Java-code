package com.itheima.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        // 目标： 理解自动类型转换机制
        // 小范围类型的变量 -> 大范围类型的变量
        // 类型范围小的变量，可以直接赋值给类型范围大的变量
        byte a = 12; // 发生了自动类型转换
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int c = 100; // 4字节
        double d = c; // 8字节 发生了自动类型转换
        System.out.println(d);

        char ch = 'a'; // 'a' 97 => 00000000 01100001
        int i = ch; // 发生了自动类型转换 => 00000000 00000000 00000000 01100001
        System.out.println(i);
        // 自动类型转换的其他形式
        // byte -> short -> int -> long -> float -> double
        //            char -^
    }
}

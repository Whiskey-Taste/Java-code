package com.itheima.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        // 目标： 掌握基本的算术运算符的使用
        int a = 10;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b); // 20
        System.out.println(a / b); // 5
        // 在Java中，两个整数相除的结果还是整数，因为最高类型是整数
        System.out.println(5 / 2); // 2.5 ==> 2
        System.out.println(5.0 / 2); // 2.5
        int i = 5;
        int j = 2;
        System.out.println(1.0 * i / j); // 2.5

        System.out.println(a % b); // 0
        System.out.println(3 % 2); // 1

        System.out.println("------------------------");

        // 目标2： 掌握使用+符号做连接符的情况
        // "+"符号与字符串运算的时候用作连接符，其结果依然是字符串
        // 能算则算，不能算就在一起
        int a2 = 5;
        System.out.println("abc" + a2); // "abc5"
        System.out.println(a2 + 5); // 10
        System.out.println("itheima" + a2 + 'a'); // "itheima5a"
        System.out.println(a2 + 'a' + "itheima"); // 5 + 'a' = 5 + 97 = 102 ==> "102itheima"
    }
}

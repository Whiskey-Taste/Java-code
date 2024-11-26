package com.itheima.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        // 目标： 掌握关系运算符的基本使用
        // 判断数据是否满足条件，返回布尔值true或false
        int a = 10;
        int b = 5;
        boolean rs = a > b;
        System.out.println(rs);

        System.out.println(a >= b); // a大于b或者a等于b
        System.out.println(2 >= 2); // true
        System.out.println(a < b);
        System.out.println(a <= b); // false
        System.out.println(2 <= 2); // true
        System.out.println(a == b); // false
        System.out.println(5 == 5); // true
        // System.out.println(a = b); // 注意： 判断是否相等一定用 == ，=是用来赋值的
        System.out.println(a != b); // true
        System.out.println(10 != 10); // false
    }
}

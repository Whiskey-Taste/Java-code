package com.itheima.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
        // 目标： 掌握逻辑运算符的使用
        // 需求： 要求手机必须满足尺寸大于等于6.95，且内存必须大于等于8
        double size = 6.8;
        int storage = 16;
        // 1、& 一个为false，结果为false
        boolean rs = size >= 6.95 & storage >= 8;
        System.out.println(rs);

        // 需求2： 要么手机必须满足尺寸大于等于6.95，要么内存必须大于等于8
        // 2、| 一个为true，结果为true
        boolean rs2 = size >= 6.95 | storage >= 8;
        System.out.println(rs2);

        // 注意： & 和 | 无论左边为false还是true，右边都要执行

        // 3、! 取反
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(2 > 1)); // false

        // 4、^ 异或 相同为false，不同为true
        System.out.println(true ^ true); // false
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true

        // 5、&& 短路与 一个为false，结果为false，但前一个为false，后一个条件不执行
        int i = 10;
        int j = 20;
        // System.out.println(i > 100 && ++j > 99);
        System.out.println(i > 100 & ++j > 99);
        System.out.println(j);

        // 6、|| 短路或 一个为true，结果为true，但前一个为true，后一个条件不执行
        int m = 10;
        int n = 30;
        // System.out.println(m > 3 || ++n > 40);
        System.out.println(m > 3 | ++n > 40);
        System.out.println(n);

        // 注意： 实际开发中常用 &&、||、!
    }
}

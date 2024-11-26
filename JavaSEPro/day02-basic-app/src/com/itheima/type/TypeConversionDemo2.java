package com.itheima.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        // 目标： 掌握表达式的自动类型转换机制
        // 在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算
        // byte、short、char -> int -> long -> float -> double
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs1 = a + b + c;
        System.out.println(rs1);

        // 表达式的最终结果类型由表达式中的最高类型决定
        double rs2 = a + b + 1.0;
        System.out.println(rs2);

        // 在表达式中，byte、short、char是直接转换成int类型参与运算的
        byte i = 10;
        short j = 30;
        // short rs3 = i + j; 报错
        int rs3 = i + j;
        System.out.println(rs3);

        // 面试笔试题
        byte b1 = 110;
        byte b2 = 80;
        // byte b3 = b1 + b2; 报错
        int b3 = b1 + b2;
        System.out.println(b3);
    }
}

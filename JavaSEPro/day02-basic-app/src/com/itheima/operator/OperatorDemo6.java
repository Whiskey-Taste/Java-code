package com.itheima.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        // 目标： 掌握三元运算符的基本使用
        // 格式： 条件表达式 ? 值1 : 值2
        double score = 58.5;
        String rs = score >= 60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);

        // 需求2： 找出两个整数中的较大值并输出
        int a = 99;
        int b = 69;
        int max = a > b ? a : b;
        System.out.println(max);

        // 需求3： 找出三个整数中的较大值
        int i = 10;
        int j = 45;
        int k = 34;

        // 找出两个整数中的较大值
        int temp = i > j ? i : j;
        // 找出temp与k中的较大值
        int max2 = temp > k ? temp : k;
        System.out.println(max2);

        // 运算符优先级
        // 小括号()优先级最高
        System.out.println(10 > 3 || 10 > 3 && 10 < 3); // true
        System.out.println((10 > 3 || 10 > 3) && 10 < 3); // false

    }
}

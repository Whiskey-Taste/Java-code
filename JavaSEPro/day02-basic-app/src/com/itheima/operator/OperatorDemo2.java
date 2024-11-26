package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标： 掌握自增自减运算符的使用
        // 自增 ++ 放在变量前后，对变量值加一
        // 自减 -- 放在变量前后，对变量值减一
        // 单独使用放在变量前后没有区别

        int a = 10;
        // a++; // a = a + 1
        ++a;
        System.out.println(a);

        // a--; // a = a - 1
        --a;
        System.out.println(a);

        // System.out.println(2++); // 自增自减只能操作变量不能操作字面量，会报错！

        System.out.println("------------------------");

        // ++、--如果不是单独使用，而是在表达式中或同时有其他操作，放在变量前后会存在明显区别
        int i = 10;
        int rs = ++i; // 先加后用： 放在变量前面，先对变量进行增减，再拿变量值进行运算
        System.out.println(rs);
        System.out.println(i);

        int j = 10;
        int rs2 = j++; // 先用后加： 放在变量后面，先拿变量值进行运算，再对变量进行增减
        System.out.println(rs2);
        System.out.println(j);
    }
}

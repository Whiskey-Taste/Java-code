package com.itheima.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        // 目标： 掌握常见数据在程序中的书写格式
        // 1、整数
        System.out.println(777);

        // 2、小数
        System.out.println(99.5);

        // 3、字符： 必须要用单引号围起来，有且只能有一个字符
        System.out.println('a');
        System.out.println('0');
        System.out.println('中');
//        System.out.println('中国');
        System.out.println(' '); // 空字符
//        System.out.println('');
        // 特殊的字符： \n 换行， \t 制表符tab
        System.out.println('中');
        System.out.println('\n');
        System.out.println('国');
        System.out.println('\t');

        // 4、字符串： 必须用双引号围起来，里面的内容可有可无
        System.out.println("这是字符串");
        System.out.println("");
        System.out.println("  ");
        System.out.println("这");

        // 5、布尔值： 只有两个值 ture false
        System.out.println(true);
        System.out.println(false);
    }
}

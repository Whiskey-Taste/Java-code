package com.itheima.loop;

public class ForDemo2 {
    public static void main(String[] args) {
        // 目标： 掌握使用for循环批量生产数据
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("------------------------");

        // 2、定义一个变量用于求和
        int sum = 0;

        // 1、定义一个循环，先产生1-5，这5个数
        for (int i = 1; i <= 5 ; i++) {
            sum += i;
        }
        System.out.println("1-5的数据和" + sum);

        System.out.println("------------------------");

        // 2、定义一个变量用于求和
        int sum2 = 0;

        // 1、定义一个循环，先产生1-100，这100个数
        for (int i = 1; i <= 100 ; i++) {
            sum2 += i;
        }
        System.out.println("1-100的数据和" + sum2);

        System.out.println("------------------------");

        // 2、定义一个变量用于求和
        int sum3 = 0;

        // 1、定义一个循环，产生1-100之间的奇数
        for (int i = 1; i <= 100; i+=2) {
            sum3 += i;
        }
        System.out.println("1-100之间的奇数和" + sum3);

        System.out.println("------------------------");

        // 3、定义一个变量用于求和
        int sum4 = 0;

        // 1、定义一个循环，先产生1-100，这100个数
        for (int i = 1; i <= 100; i+=2) {
            // 2、使用if分支，判断i记住的数字是否是奇数，是奇数则累加给变量
            if (i % 2 == 1 /*i % 2 != 0*/) {
                sum4 += i;
            }
        }
        System.out.println("1-100之间的奇数和" + sum4);
    }
}

package com.itheima.loop;

public class WhileDemo3 {
    public static void main(String[] args) {
        // 目标： 掌握while循环的书写格式，理解其执行流程
        /**
           初始化语句;
           while(循环条件){
                循环体语句(被重复执行的代码);
                迭代语句;
           }
         */
        // 需求： 打印多行Hello World
        int i = 0;
        while (i < 5){
            // i = 0 1 2 3 4 5
            System.out.println("Hello World");
            i++;
        }
        // while和for功能上完全一样，for能解决的while也能解决，反之亦然
        // 使用规范：知道循环几次：用for；不知道循环几次：用while
    }
}

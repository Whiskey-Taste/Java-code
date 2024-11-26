package com.itheima.loop;

public class ForDemo1  {
    public static void main(String[] args) {
        // 目标： 掌握for循环的书写格式，理解其执行流程
        // 常见应用场景： 减少代码的重复编写，灵活控制程序的执行
        /**
           for循环格式
           for(初始化语句; 循环条件; 迭代语句){
                    循环体语句(重复执行的代码);
           }
         */
        // 需求： 打印多行Hello World
        /**
           流程：
                首先执行初始化语句： int i = 0;
                i = 0，判断循环条件0 < 3，返回true，计算机会进入循环中执行输出的第一行Hello World，接着执行迭代语句i++
                i = 1，判断循环条件0 < 3，返回true，计算机会进入循环中执行输出的第二行Hello World，接着执行迭代语句i++
                i = 2，判断循环条件0 < 3，返回true，计算机会进入循环中执行输出的第三行Hello World，接着执行迭代语句i++
                i = 3，判断循环条件0 < 3，返回false，循环会立即结束
         */
        for(int i = 0; i < 3; i++){
            System.out.println("Hello world");
        }

        System.out.println("------------------------");
        for(int i = 1; i <= 5; i++){
            // i = 1 2 3 4 5
            System.out.println("Hello World2");
        }

        System.out.println("------------------------");
        for(int i = 1; i <= 10; i += 2){
            // i = 1 3 5 7 9
            System.out.println("Hello World3");
        }
    }
}

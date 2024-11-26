package com.itheima.scanner;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        // 学会使用API(Application programming interface)文档
        // 1、导包：一般不需要自己做，idea工具会自动导包
        // 2、抄代码：得到一个键盘扫描器对象（东西）
        Scanner sc = new Scanner(System.in);

        // 3、开始调用sc的功能，来接受用户键盘输入的数据
        System.out.println("请输入您的年龄： ");
        int age = sc.nextInt(); // 执行到这儿会等待用户输入一个整数，直到用户按回车才会拿到数据
        System.out.println("年龄是：" + age);

        System.out.println("请输入您的名称：");
        String name = sc.next(); // 执行到这儿会等待用户输入一个字符串，直到用户按回车才会拿到数据
        System.out.println("欢迎：" + name);
    }
}

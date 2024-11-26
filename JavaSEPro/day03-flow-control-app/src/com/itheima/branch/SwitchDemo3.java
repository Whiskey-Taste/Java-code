package com.itheima.branch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        // 目标： 搞清楚switch使用时的几点注意事项
        // 1、表达式类型仅支持byte,short,int,char, JDK5开始支持枚举enum, JDK7开始支持String, 不支持double,float,long
        int a = 10;
        double b = 0.1;
        double b2 = 0.2;
        double c = b + b2;
        System.out.println(c);
        switch (a){

        }

        // 2、case给出的值不允许重复，且只能是字面量，不能是变量
        int i = 20;
        int d = 10;
        switch (i){
            case 10:

                break;
            case 20:

                break;
        }

        // 3、正常使用switch的时候，不要忘记写break，否则会出现穿透现象
        String date = "周三";
        switch(date){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
                System.out.println("请大牛帮忙");
                break;
            case "周三":
                System.out.println("吃烧烤");
            case "周四":
                System.out.println("帮女程序员解决bug");
                break;
            case "周五":
                System.out.println("今晚吃鸡");
                break;
            case "周六":
                System.out.println("晚宴");
                break;
            case "周日":
                System.out.println("准备上班");
                break;
            default:
                System.out.println("输入的星期信息有误");
        }
    }
}

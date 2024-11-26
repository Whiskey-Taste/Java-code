package com.itheima.branch;

public class SwitchDemo2 {
    public static void main(String[] args) {
        // 目标： 掌握switch的写法，理解其执行流程

        String date = "周天";
        switch(date){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
                System.out.println("请大牛帮忙");
                break;
            case "周三":
                System.out.println("吃烧烤");
                break;
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

        // 注意：if switch比较：
        // 1. if功能上远远强大于switch
        // 2. if适合条件是区间判断的情况
        // 3. switch适合条件是比较值的情况、代码优雅、性能较好
    }
}

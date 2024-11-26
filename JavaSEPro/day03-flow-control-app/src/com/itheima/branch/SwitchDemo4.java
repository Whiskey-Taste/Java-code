package com.itheima.branch;

public class SwitchDemo4 {
    public static void main(String[] args) {
        // 目标2： 理解switch穿透性的作用：
        // 当存在多个case分支代码相同时，可以把相同的代码放在一个case块中
        // 其他的case块都通过穿透性穿透到该case块执行代码以实现代码简化

        String date = "周六";
        switch(date){
            case "周一":
                System.out.println("埋头苦干");
                break;
            case "周二":
            case "周三":
            case "周四":
                System.out.println("请大牛帮忙");
                break;
            case "周五":
                System.out.println("自己整理代码");
                break;
            case "周六":
            case "周日":
                System.out.println("打游戏");
                break;
            default:
                System.out.println("输入的星期信息有误");
        }
    }
}

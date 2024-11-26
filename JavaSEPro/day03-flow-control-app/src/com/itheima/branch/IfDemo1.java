package com.itheima.branch;

public class IfDemo1 {
    public static void main(String[] args) {
        // 目标： 掌握if分支三种形式的用法和执行流程
        // 需求： 测量用户温度，高于37度就报警
        double t = 36.8;
        if(t > 37){
            System.out.println("温度异常");
        }

        // 需求2： 发红包，钱包余额99元，需要发出90元
        // 如果钱够，触发发红包动作；如果钱不够，提示余额不足
        double money = 89;
        if(money >= 90){
            System.out.println("发送成功");
        }else{
            System.out.println("余额不足");
        }

        // 需求3：公司绩效系统，根据员工打分输出对应绩效： [0,60) D, [60,80) C, [80,90) B, [90,100] A
        int score = 298;
        String level;
        if(score > 0 && score < 60){
            System.out.println("您的级别是：D");
        }else if(score >= 60 && score < 80){
            System.out.println("您的级别是：C");
        }else if(score >= 80 && score < 90){
            System.out.println("您的级别是：B");
        }else if(score >= 90 && score <= 100){
            System.out.println("您的级别是：A");
        }else{
            System.out.println("您录入的分数有误");
        }

        // 注意：if(){}, ()后不能跟； 否则{}中的代码将不受if控制
        double t2 = 36.8;
        if(t2 > 37);{
            System.out.println("温度异常");
        }

        // 注意：如果if语句{}中只有一行代码，{}可以省略不写 （不推荐）
        double t3 = 36.8;
        if(t3 > 37)
            System.out.println("温度异常");


    }
}

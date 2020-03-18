package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyDaysInMonth(0));
        System.out.println(howManyDaysInMonth(1));
        System.out.println(howManyDaysInMonth(5));
        System.out.println(howManyDaysInMonth(9));
        System.out.println(howManyDaysInMonth(11));
    }

    /**
     * 输入一个月份，返回该月份在平年的天数或者"非法输入"
     *
     * <p>最好使用switch语句
     *
     * <p>例如，输入2，返回"2月有28天"；输入12，返回"12月有31天"。若输入的是1~12之外的值，返回"非法输入"
     *
     * @param month 月份
     * @return 结果字符串
     */
    public static String howManyDaysInMonth(int month) {
        int sum;
        switch (month) {

            case 1:
                sum = 31;
                break;
            case 2:
                sum = 28;
                break;
            case 3:
                sum = 31;
                break;
            case 4:
                sum = 30;
                break;
            case 5:
                sum = 31;
                break;
            case 6:
                sum = 30;
                break;
            case 7:
                sum = 31;
                break;
            case 8:
                sum = 31;
                break;
            case 9:
                sum = 30;
                break;
            case 10:
                sum = 31;
                break;
            case 11:
                sum = 30;
                break;
            case 12:
                sum = 31;
                break;
            default:
                return "非法输入";
        }
        return month + "月有" + sum + "天";
    }
}
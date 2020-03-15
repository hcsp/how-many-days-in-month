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
        if(month < 1 || month > 12) {
            return "非法输入";
        } else {
            if(month == 2) {
                return month + "月有28天";
            } else {
                if(month % 2 == 0 && month < 8) {
                    return month + "月有30天";
                } else if(month % 2 != 0 && month < 8){
                    return month + "月有31天";
                } else if(month % 2 == 0 && month >= 8){
                    return month + "月有31天";
                } else if(month % 2 != 0 && month >= 8) {
                    return month + "月有30天";
                }
            }
        }
        return "";
    }
}

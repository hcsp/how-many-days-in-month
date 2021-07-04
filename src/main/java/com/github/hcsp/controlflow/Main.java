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
        switch (month) {
            case 1:
                return "1月有31天";
            case 3:
                return "3月有31天";
            case 5:
                return "5月有31天";
            case 7:
                return "7月有31天";
            case 8:
                return "8月有31天";
            case 10:
                return "10月有31天";
            case 12:
                return "12月有31天";
            case 2:
                return "2月有28天";
            case 4:
                return "4月有30天";
            case 6:
                return "6月有30天";
            case 9:
                return "9月有30天";
            case 11:
                return "11月有30天";
            default:
                return "非法输入";
        }
    }
}

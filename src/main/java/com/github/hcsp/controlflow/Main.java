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
        int month_day = 0;
        String print_string;
        switch (month) {
            case 1:
                month_day = 31;
                break;
            case  2:
                month_day =28;
                break;
            case 3:
                month_day = 31;
                break;
            case 4:
                month_day =30;
                break;
            case 5:
                month_day = 31;
                break;
            case 6:
                month_day =30;
                break;
            case 7:
                month_day = 31;
                break;
            case 8:
                month_day =31;
                break;
            case 9:
                month_day = 30;
                break;
            case 10:
                month_day =31;
                break;
            case 11:
                month_day = 30;
                break;
            case 12:
                month_day =31;
                break;
            default :
                return "非法输入";
        }
        print_string = String.format("%d月有%d天",month,month_day);
        return print_string;
    }
}

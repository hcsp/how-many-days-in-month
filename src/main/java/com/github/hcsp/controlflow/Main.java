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
        String result;

        switch (month) {
            case 1:
                result = month + "月有31天";
                break;
            case 2:
                result = month + "月有28天";
                break;
            case 3:
                result = month + "月有31天";
                break;
            case 4:
                result = month + "月有30天";
                break;
            case 5:
                result = month + "月有31天";
                break;
            case 6:
                result = month + "月有30天";
                break;
            case 7:
                result = month + "月有31天";
                break;
            case 8:
                result = month + "月有31天";
                break;
            case 9:
                result = month + "月有30天";
                break;
            case 10:
                result = month + "月有31天";
                break;
            case 11:
                result = month + "月有30天";
                break;
            case 12:
                result = month + "月有31天";
                break;
            default:
                result = "非法输入";


        }

        return result;
    }
}

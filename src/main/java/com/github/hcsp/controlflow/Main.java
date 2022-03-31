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
        int i = month;
        String str;
        switch (i) {
            case 1:
                str = "1月有31天";
                break;
            case 2:
                str = "2月有28天";
                break;
            case 3:
                str = "3月有31天";
                break;
            case 4:
                str = "4月有30天";
                break;
            case 5:
                str = "5月有31天";
                break;
            case 6:
                str = "6月有30天";
                break;
            case 7:
                str = "7月有31天";
                break;
            case 8:
                str = "8月有31天";
                break;
            case 9:
                str = "9月有30天";
                break;
            case 10:
                str = "10月有31天";
                break;
            case 11:

                str = "11月有30天";
                break;
            case 12:

                str = "12月有31天";
                break;

            default:

                 str = "非法输入";
                 break;
        }
        return str;
    }
}

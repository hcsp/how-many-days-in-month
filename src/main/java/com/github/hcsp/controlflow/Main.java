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
        String result = "";
        switch (month){
            case 1:
                System.out.println("1月有31天");
                result = "1月有31天";
                break;
            case 2:
                System.out.println("2月有28天");
                result = "2月有28天";
                break;
            case 3:
                System.out.println("3月有31天");
                result = "3月有31天";
                break;
            case 4:
                System.out.println("4月有30天");
                result = "4月有30天";
                break;
            case 5:
                System.out.println("5月有31天");
                result = "5月有31天";
                break;
            case 6:
                System.out.println("6月有30天");
                result = "6月有30天";
                break;
            case 7:
                System.out.println("7月有31天");
                result = "7月有31天";
                break;
            case 8:
                System.out.println("8月有31天");
                result = "8月有31天";
                break;
            case 9:
                System.out.println("9月有30天");
                result = "9月有30天";
                break;
            case 10:
                System.out.println("10月有31天");
                result = "10月有31天";
                break;
            case 11:
                System.out.println("11月有30天");
                result = "11月有30天";
                break;
            case 12:
                System.out.println("12月有31天");
                result = "12月有31天";
                break;
            default:
                System.out.println("非法输入");
                result = "非法输入";
        }
        return result;
    }
}

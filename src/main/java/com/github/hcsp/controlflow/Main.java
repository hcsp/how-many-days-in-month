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
        StringBuilder buffer = new StringBuilder();
        switch (month) {
            case 1:
                buffer.append("1月有31天");
                break;
            case 2:
                buffer.append("2月有28天");
                break;
            case 3:
                buffer.append("3月有31天");
                break;
            case 4:
                buffer.append("4月有30天");
                break;
            case 5:
                buffer.append("5月有31天");
                break;
            case 6:
                buffer.append("6月有30天");
                break;
            case 7:
                buffer.append("7月有31天");
                break;
            case 8:
                buffer.append("8月有31天");
                break;
            case 9:
                buffer.append("9月有30天");
                break;
            case 10:
                buffer.append("10月有31天");
                break;
            case 11:
                buffer.append("11月有30天");
                break;
            case 12:
                buffer.append("12月有31天");
                break;
            default:
                buffer.append("非法输入");
                break;
        }
        return buffer.toString();
    }
}

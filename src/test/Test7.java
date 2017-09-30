package test;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 
 * @author Administrator
 *
 */
public class Test7 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要统计的字符串：");
        String value = scanner.nextLine();
        countValue(value); 
    }

    public static void countValue(String value) {
        char[] cs = value.toCharArray();

        int en = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < cs.length; i++) {

            int now = (int) cs[i];

            if (now == 32) {
                space++;
            } else if ((now >= 65 && now <= 90) || (now >= 97 && now <= 122)) {
                en++;
            } else if (now >= 48 && now <= 57) {
                num++;
            } else {
                other++;
            }

        }
        System.out.println("“" + value + "”" + "字符串中有：");
        System.out.println("英文字母 " + en + "个，有空格 " + space + "个，有数字 " + num + "个，有其他字符 " + other + "个。");
    }

}

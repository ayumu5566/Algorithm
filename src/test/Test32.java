package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 题目：取一个整数a从右端开始的4～7位。
 * 
 * @author Administrator
 *
 */
public class Test32 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数：");
        String num = scanner.nextLine();
        boolean isPass = validation(num, "^-?\\d+$");
        if (isPass) {
            if (num.length() < 7) {
                System.out.println("输入错误，输入的整数不够7位");
            } else {
                System.out.println("截取后：" + split(num));
            }
        } else {
            System.out.println("输入错误，请重新输入");
        }
    }

    private static boolean validation(String num, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(num);
        boolean isPass = matcher.matches();
        return isPass;
    }

    private static String split(String num) {
        String splitString = num.substring(num.length() - 7, num.length() - 3);
        return splitString;
    }

}

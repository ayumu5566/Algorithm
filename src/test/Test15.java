package test;

import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 
 * @author Administrator
 *
 */
public class Test15 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.print("请输入第二个整数：");
        int num2 = scanner.nextInt();
        System.out.print("请输入第三个整数：");
        int num3 = scanner.nextInt();

        boolean b1 = num1 > num2 ? true : false;
        if (b1) {
            int t = num1;
            num1 = num2;
            num2 = t;
        }
        boolean b2 = num2 > num3 ? true : false;
        if (b2) {
            int t = num2;
            num2 = num3;
            num3 = t;
        }
        boolean b3 = num1 > num2 ? true : false;
        if (b3) {
            int t = num1;
            num1 = num2;
            num2 = t;
        }
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }

}

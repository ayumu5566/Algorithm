package test;

import java.util.Scanner;

/**
 * 题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n
 * 
 * @author Administrator
 *
 */
public class Test39 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            // 偶数
            System.out.println("结果为：" + functionForEvenNumber(n));
        } else {
            // 奇数
            System.out.println("结果为：" + functionForOddNumber(n));
        }
    }

    private static double functionForEvenNumber(int n) {
        double result = 0;
        for (int i = 2; i <= n; i = i + 2) {
            result += ((double) 1 / i);
        }
        return result;
    }

    private static double functionForOddNumber(int n) {
        double result = 0;
        for (int i = 1; i <= n; i = i + 2) {
            result += ((double) 1 / i);
        }
        return result;
    }

}

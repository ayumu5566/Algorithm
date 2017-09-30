package test;

/**
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 
 * 分子等于前俩分子之和 分母等于前俩分母之和
 * 
 * @author Administrator
 *
 */
public class Test20 {

    public static void main(String[] args) {
        double result = 0;
        for (int i = 1; i <= 20; i++) {
            result += ((double) molecular(i) / (double) denominator(i));
            System.out.println(molecular(i) + "/" + denominator(i));
        }
        System.out.println("最终结果：" + result);
    }

    private static int molecular(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 2;
        }
        return molecular(num - 1) + molecular(num - 2);
    }

    private static int denominator(int num) {
        if (num == 0) {
            return 1;
        }
        if (num == 1) {
            return 1;
        }
        return denominator(num - 1) + denominator(num - 2);
    }
}

package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。
 * 
 * @author Administrator
 *
 */
public class Test9 {

    public static void main(String[] args) {
        System.out.println("1000以内的所有完数：");
        List<Integer> perfectNumbers = findPerfectNumber();
        for (Integer perfectNumber : perfectNumbers) {
            System.out.print(perfectNumber + " ");
        }
    }

    public static List<Integer> findPerfectNumber() {
        List<Integer> perfectNumbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            int result = findFactor(i);
            if (i == result) {
                perfectNumbers.add(i);
            }
        }
        return perfectNumbers;
    }

    public static int findFactor(int num) {
        int result = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }
        return result;
    }
}

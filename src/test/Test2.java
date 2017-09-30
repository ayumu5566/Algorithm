package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 * 
 * @author Administrator
 *
 */
public class Test2 {

    public static void main(String[] args) {
        List<Integer> primeNumbers = countPrimeNumber();
        int size = primeNumbers.size();
        if (size > 0) {
            System.out.println("101-200之间有" + size + "个素数");
            System.out.println("如下：");
            for (Integer primeNumber : primeNumbers) {
                System.out.println(primeNumber);
            }
        } else {
            System.out.println("无");
        }
    }

    public static List<Integer> countPrimeNumber() {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 101; i <= 200; i++) {
            int num = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    num++;
                }
            }
            if (num == 0) {
                primeNumbers.add(i);
            }
        }
        if (primeNumbers.size() > 0) {
            return primeNumbers;
        }
        return null;
    }
}

package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 90 / 2 = 45 45 / 3 = 15 15 / 3 = 5 5 /
 * 5 = 1 分解过程：取最小的质数，若除不尽，则找下一个质数
 * 
 * @author Administrator
 *
 */
public class Test4 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println(number + "分解质因数：");
        findPrimeFactors(number);

    }

    /**
     * 查找质数
     * 
     * @param number
     */
    public static List<Integer> findPrimeNumber(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    /**
     * 算出最小质因数
     * 
     * @param number
     */
    public static void findPrimeFactors(int number) {
        List<Integer> primeNumbers = findPrimeNumber(number);
        for (int i = 0; i < primeNumbers.size(); i++) {
            if (number % primeNumbers.get(i) == 0) {
                System.out.println(primeNumbers.get(i));
                findPrimeFactors((int) number / primeNumbers.get(i));
                break;
            }
        }
    }
}

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * @author Administrator
 *
 */
public class Test6 {

    public static void main(String[] args) {
        System.out.println("最大公约数：" + findMaximumCommonDivisor(12, 18));
        System.out.println("最小公倍数：" + findLeastCommonMultiple(12, 18));
    }

    public static int findMaximumCommonDivisor(int m, int n) {
        List<Integer> nums = new ArrayList<>();
        if (m > n) {
            int r = n;
            n = m;
            m = r;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                nums.add(i);
            }
        }
        Collections.sort(nums, Collections.reverseOrder());
        return nums.get(0);
    }

    public static int findLeastCommonMultiple(int m, int n) {
        if (m > n) {
            int r = n;
            n = m;
            m = r;
        }
        int maximumCommonDivisor = findMaximumCommonDivisor(m, n);
        int n1 = m / maximumCommonDivisor;
        int n2 = n / maximumCommonDivisor;
        return maximumCommonDivisor * n1 * n2;
    }
}

package test;

import java.util.Arrays;

/**
 * 题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 * 
 * @author Administrator
 *
 */
public class Test35 {

    public static void main(String[] args) {
        int[] numbers = { 32, 45, 76, 48, 63, 988, 76, 11, 33, 25 };
        System.out.println(Arrays.toString(numbers));
        int max = 0;
        int maxNum = 0;
        int min = numbers[0];
        int minNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxNum = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                minNum = i;
            }
        }
        numbers[maxNum] = numbers[0];
        numbers[0] = max;
        numbers[minNum] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = min;

        System.out.println(Arrays.toString(numbers));
    }

}

package test;

import java.util.Scanner;

/**
 * 题目：对10个数进行排序
 * 
 * @author Administrator
 *
 */
public class Test28 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("请输入第" + i + "个数：");
            numbers[i - 1] = scanner.nextInt();
        }
        xuanzeDesc(numbers);
        System.out.println();
        xuanzeAsc(numbers);
        System.out.println();
        maopaoDesc(numbers);
        System.out.println();
        maopaoAsc(numbers);
    }

    /**
     * 选择排序法（降序）
     * 
     * @param numbers
     */
    private static void xuanzeDesc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    /**
     * 选择排序法（升序）
     * 
     * @param numbers
     */
    private static void xuanzeAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    private static void maopaoDesc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    private static void maopaoAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}

package test;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 
 * @author Administrator
 *
 */
public class Test5 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int source = scanner.nextInt();

        String s = (source >= 60 ? (source > 89 ? "A" : "B") : "C");

        System.out.println(s);
    }

}

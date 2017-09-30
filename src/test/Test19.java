package test;

/**
 * 题目：打印出如下图案（菱形）
 *
 ***
 ******
 ********
 ******
 ***
 *
 * @author Administrator
 *
 */
public class Test19 {

    public static void main(String[] args) {
        // printTriangle();
        printRhombus();

    }

    public static void printTriangle() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            for (int j = i * 2 - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRhombus() {
        for (int i = 1; i <= 4; i++) {
            if (i <= 2) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 3; i >= 1; i--) {
            if (i <= 2) {
                for (int j = i * 2 - 1; j >= 1; j--) {
                    System.out.print("*");
                }
            } else {
                for (int j = i * 2; j >= 1; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

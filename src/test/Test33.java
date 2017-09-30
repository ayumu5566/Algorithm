package test;

/**
 * 打印出杨辉三角形（要求打印出10行如下图）
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * @author Administrator
 *
 */
public class Test33 {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i ; j++) {
                if (j == 1 || j == i) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print((j+j) + " ");
                }
            }
            System.out.println();
        }
    }

}

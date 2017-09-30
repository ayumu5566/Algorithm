package test;

/**
 * 题目：求100之内的素数
 * 
 * @author Administrator
 *
 */
public class Test27 {

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int num = 0;
            for (int j = 2; j < i; j++) {
                if (i != 1 && i != 100) {
                    if (i % j == 0) {
                        num++;
                    }
                }
            }
            if (num == 0) {
                System.out.print(i + " ");
            }
        }
    }

}

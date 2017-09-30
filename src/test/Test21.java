package test;

/**
 * 题目：求1+2!+3!+...+20!的和
 * 
 * @author Administrator
 *
 */
public class Test21 {

    public static void main(String[] args) {
        long result = 0;
        for (int i = 1; i <= 20; i++) {
            result += factorial(i);
        }
        System.out.println(result);
    }

    private static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

}

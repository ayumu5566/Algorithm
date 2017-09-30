package test;

/**
 * 题目：利用递归方法求5!
 * 
 * @author Administrator
 *
 */
public class Test22 {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static long factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

}

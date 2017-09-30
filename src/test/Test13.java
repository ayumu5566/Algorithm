package test;

/**
 * 题目：一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？
 * 
 * 324
 * 
 * @author Administrator
 *
 */
public class Test13 {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        int num3 = 0;
        int num4 = 0;
        for (int i = 0; i > -1; i++) {
            num1 = i + 100;
            num2 = i + 168;

            num3 = (int) Math.sqrt(num1);
            num4 = (int) Math.sqrt(num2);

            if (num3 * num3 == num1 && num4 * num4 == num2) {
                System.out.println("一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，这个整数是 ： " + i);
                break;
            }
        }
    }

}

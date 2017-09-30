package test;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 
 * @author Administrator
 *
 */
public class Test1 {
    
    public static void main(String[] args) {
        int month = 20;
        for (int i = 1; i <= month; i++) {
            System.out.println(test(i));
        }
    }

    public static int test(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        return test(x - 1) + test(x - 2);
    }
}

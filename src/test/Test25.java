package test;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 * 
 * @author Administrator
 *
 */
public class Test25 {

    public static void main(String[] args) {
        judgment(12321);
    }

    private static void judgment(int num) {
        String snum = String.valueOf(num);
        if (snum.length() != 5) {
            System.out.println("输入的不是五位数");
        } else {
            char[] cnum = snum.toCharArray();
            if (cnum[0] == cnum[4] && cnum[1] == cnum[3]) {
                System.out.println(num + "这个五位数是回文数");
            } else {
                System.out.println(num + "这个五位数不是回文数");
            }
        }
    }

}

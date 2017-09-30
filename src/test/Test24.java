package test;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * 
 * @author Administrator
 *
 */
public class Test24 {

    public static void main(String[] args) {
        parse(3232);
    }

    private static void parse(int num) {
        String snum = String.valueOf(num);
        System.out.println(num + "是" + snum.length() + "位数！");

        System.out.print("逆序打印：");
        char[] cnum = snum.toCharArray();
        for (int i = cnum.length - 1; i >= 0; i--) {
            System.out.print(cnum[i]);
        }
    }

}

package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相
 * 加有键盘控制。
 * 
 * @author Administrator
 *
 */
public class Test8 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要加的数：");
        int c1 = scanner.nextInt();
        System.out.print("请输入次数：");
        int c2 = scanner.nextInt();
        try {
            System.out.println(" = " + computations(c1, c2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static long computations(int num, int time) throws Exception {
        String str = String.valueOf(num);
        if (str.length() != 1) {
            throw new Exception();
        }
        char[] cs = str.toCharArray();
        int sss = (int) cs[0];
        if (sss <= 48 && sss >= 57) {
            throw new Exception();
        }

        List<String> s = new ArrayList<>();

        for (int i = 1; i <= time; i++) {
            s.add(ggg(str, i));
        }

        long result = 0;

        for (int i = 0; i < s.size(); i++) {
            if (i == s.size() - 1) {
                System.out.print(s.get(i));
            } else {
                System.out.print(s.get(i) + " + ");
            }
            result += (long) Integer.parseInt(s.get(i));
        }

        return result;
    }

    public static String ggg(String value, int num) {
        String now = "";
        for (int i = 0; i < num; i++) {
            now += value;
        }
        return now;
    }

}

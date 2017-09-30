package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 题目：输入3个数a,b,c，按大小顺序输出。
 * 
 * @author Administrator
 *
 */
public class Test34 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入第一个数：");
            list.add(scanner.nextInt());
        }
        Collections.sort(list, Collections.reverseOrder());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}

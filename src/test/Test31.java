package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 题目：将一个数组逆序输出。
 * 
 * @author Administrator
 *
 */
public class Test31 {

    public static void main(String[] args) {
        Integer[] numbers = { 12, 22, 45, 48, 63, 77, 78, 88, 95, 145 };

        List<Integer> numberList = new ArrayList<Integer>(Arrays.asList(numbers));
        Collections.reverse(numberList);
        for (Integer integer : numberList) {
            System.out.print(integer + " ");
        }
    }

}

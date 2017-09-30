package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 
 * @author Administrator
 *
 */
public class Test30 {

    public static void main(String[] args) {
        // Integer[] numbers = { 145, 95, 88, 78, 77, 63, 48, 45, 22, 12 };
        Integer[] numbers = { 12, 22, 45, 48, 63, 77, 78, 88, 95, 145 };
        Integer num = 44;
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        for (int i = 0; i < numberList.size();) {
            numberList.add(numberList.size(), num);
            if (numberList.get(i) > numberList.get(i + 1)) {
                Collections.sort(numberList, Collections.reverseOrder());
                break;
            } else {
                Collections.sort(numberList);
                break;
            }
        }
        for (Integer integer : numberList) {
            System.out.print(integer + " ");
        }
    }

}

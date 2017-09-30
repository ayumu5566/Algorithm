package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。 例如：153是一个 "水仙花
 * 数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 
 * @author Administrator
 *
 */
public class Test3 {

    public static void main(String[] args) {
        
        List<Integer> daffodilNumbers = countDaffodilNumber();
        if (daffodilNumbers.size() > 0) {
            System.out.println("水仙花数如下：");
            for (Integer daffodilNumber : daffodilNumbers) {
                System.out.println(daffodilNumber);
            }
        }
    }

    public static List<Integer> countDaffodilNumber() {
        List<Integer> daffodilNumbers = new ArrayList<>();

        for (int i = 100; i <= 999; i++) {
            int i1 = Integer.parseInt(String.valueOf(i).substring(0, 1));
            int i2 = Integer.parseInt(String.valueOf(i).substring(1, 2));
            int i3 = Integer.parseInt(String.valueOf(i).substring(2, 3));

            int result = (int) Math.pow(i1, 3) + (int) Math.pow(i2, 3) + (int) Math.pow(i3, 3);

            // int result = (i1 * i1 * i1) + (i2 * i2 * i2) + (i3 * i3 * i3);

            if (result == i) {
                daffodilNumbers.add(i);
            }
        }

        return daffodilNumbers;
    }
}

package test;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹 多高？
 * 
 * @author Administrator
 *
 */
public class Test10 {

    public static void main(String[] args) {

        double result = 0;
        double height = 100.0;
        for (int i = 0; i < 10; i++) {
            result += height;
            height = height / 2;
            if (i < 9) {
                result += (height);
            }
            System.out.println("第" + (i + 1) + "次：" + height);
        }
        System.out.println("反复10次共经历：" + result + "米");
    }
}

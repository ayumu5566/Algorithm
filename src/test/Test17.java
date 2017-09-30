package test;

/**
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，
 * 又多吃了一个。以后每天早上都吃了前一天剩下 的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * 
 * @author Administrator
 *
 */
public class Test17 {

    public static void main(String[] args) {
        System.out.println(monkeysEatPeach(1));
        System.out.println(monkeysEatPeach(2));
        System.out.println(monkeysEatPeach(3));
        System.out.println(monkeysEatPeach(4));
        System.out.println(monkeysEatPeach(5));
        System.out.println(monkeysEatPeach(6));
        System.out.println(monkeysEatPeach(7));
        System.out.println(monkeysEatPeach(8));
        System.out.println(monkeysEatPeach(9));
        System.out.println(monkeysEatPeach(10));
    }

    public static int monkeysEatPeach(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (monkeysEatPeach(day + 1) + 1) * 2;
        }
    }

}

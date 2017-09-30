package test;

/**
 * 题目：企业发放的奖金根据利润提成。 利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%； 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%； 高于100万元时，超过100万元的部分按1%提成， 从键盘输入当月利润I，求应发放奖金总数？
 * 
 * @author Administrator
 *
 */
public class Test12 {

    public static void main(String[] args) {
        calculateBonus(1500000);
    }

    public static void calculateBonus(double profits) {
        double bonus = 0;
        if (profits <= 100000) {
            bonus = profits * 0.1;
        }
        if (profits > 100000 && profits < 200000) {
            double p1 = (profits - 100000) * 0.075;
            double p2 = 100000 * 0.1;
            bonus = p1 + p2;
        }
        if (profits >= 200000 && profits < 400000) {
            bonus = (profits - 200000) * 0.05;
        }
        if (profits >= 400000 && profits < 600000) {
            bonus = (profits - 400000) * 0.03;
        }
        if (profits >= 600000 && profits <= 1000000) {
            bonus = (profits - 600000) * 0.015;
        }
        if (profits > 1000000) {
            bonus = (profits - 1000000) * 0.01;
        }
        System.out.println("奖金：" + bonus);
    }
}

package test;

/**
 * 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。 Monday Tuesday Wednesday
 * Thursday Friday Saturday Sunday
 * 
 * @author Administrator
 *
 */
public class Test26 {

    public static void main(String[] args) {
        judgmentWeek("Sat");
    }

    private static void judgmentWeek(String week) {
        switch (week.substring(0, 1)) {
        case "M":
            System.out.println("星期一");
            break;
        case "m":
            System.out.println("星期一");
            break;
        case "T":
            switch (week.substring(1, 2)) {
            case "U":
                System.out.println("星期二");
                break;
            case "u":
                System.out.println("星期二");
                break;
            case "H":
                System.out.println("星期四");
                break;
            case "h":
                System.out.println("星期四");
                break;
            }
            ;
            break;
        case "t":
            switch (week.substring(1, 2)) {
            case "U":
                System.out.println("星期二");
                break;
            case "u":
                System.out.println("星期二");
                break;
            case "H":
                System.out.println("星期四");
                break;
            case "h":
                System.out.println("星期四");
                break;
            }
            ;
            break;
        case "W":
            System.out.println("星期三");
            break;
        case "w":
            System.out.println("星期三");
            break;
        case "F":
            System.out.println("星期五");
            break;
        case "f":
            System.out.println("星期五");
            break;
        case "S":
            switch (week.substring(1, 2)) {
            case "A":
                System.out.println("星期六");
                break;
            case "a":
                System.out.println("星期六");
                break;
            case "U":
                System.out.println("星期日");
                break;
            case "u":
                System.out.println("星期日");
                break;
            }
            ;
            break;
        case "s":
            switch (week.substring(1, 2)) {
            case "A":
                System.out.println("星期六");
                break;
            case "a":
                System.out.println("星期六");
                break;
            case "U":
                System.out.println("星期日");
                break;
            case "u":
                System.out.println("星期日");
                break;
            }
            ;
            break;
        default:
            break;
        }
    }

}

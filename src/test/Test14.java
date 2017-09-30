package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 
 * @author Administrator
 *
 */
public class Test14 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入需要判断天数的日期（格式: 2017-01-01）：");
        String dateValue = scanner.nextLine();
        try {
            System.out.println(dateValue + "是今年的第" + determineDate(dateValue));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static int determineDate(String dateValue) throws Exception {
        Pattern pattern = Pattern.compile(
                "([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))");
        Matcher matcher = pattern.matcher(dateValue);
        Boolean rs1 = matcher.matches();
        if (!rs1) {
            throw new Exception("日期格式错误");
        }
        // 将字符串转日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateValue);

        // 实例化date日期
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        int nowYEAR = calendar1.get(Calendar.DAY_OF_YEAR);

        return nowYEAR;
    }
}

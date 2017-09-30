package test;

/**
 * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名
 * 单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 * 
 * @author Administrator
 *
 */
public class Test18 {

    public static void main(String[] args) {
        String[] team1 = { "a", "b", "c" };
        String[] team2 = { "x", "y", "z" };
        
        for (int i = 0; i < team1.length; i++) {
            for (int j = 0; j < team2.length; j++) {
                if (team1[i].equals("a") && team2[j].equals("x")) {
                    continue;
                }
                if (team1[i].equals("c") && (team2[j].equals("x") || team2[j].equals("z"))) {
                    continue;
                }
                System.out.println("比赛对局名单：甲队队员：" + team1[i] + "乙队队员：" + team2[j]);
                break;
            }
        }
    }

}

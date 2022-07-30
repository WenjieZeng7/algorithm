import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Scanner;

/**
 * 联想1，赛码
 * @author Jesse 1094798816@qq.com
 * @create 2022-07-28 23:05
 */
public class Test7283 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = sc.nextLine();
        System.out.println(n);
        String[] time = new String[n];
        String in = "";
        boolean isIn = false;
        long diff = 0;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        for (int i = 0; i < n; i++) {
            time[i] = sc.nextLine();
            String[] split = time[i].split(" ");
            if (split[0].equals("in")) {
                isIn = true;
                in = split[1];
            } else {
                if (isIn == true) {
                    Date parse = format.parse(in);
                    Date parse1 = format.parse(split[1]);
                    long temp1 = (parse1.getTime() - parse.getTime()) / 1000;
                    if (temp1 < 0) {
                        temp1 += 24 * 60 * 60;
                    }
                    diff += temp1;
                }
                isIn = false;
            }
        }
        long second = diff % 60;
        long min = (diff / 60) % 60;
        long hour = diff / (60 * 60);
        StringBuilder sb = new StringBuilder();
        if (hour < 10) {
            sb.append(0);
        }
        sb.append(hour);
        sb.append(':');
        if (min < 10) {
            sb.append(0);
        }
        sb.append(min);
        sb.append(':');
        if (second < 10) {
            sb.append(0);
        }
        sb.append(second);
        System.out.println(sb.toString());
    }
}


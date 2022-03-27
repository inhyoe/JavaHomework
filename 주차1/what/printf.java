package 주차1.what;
import java.util.Date;
public class printf {
    public static void main(String[] args) {
        Date date = new Date();
        int Todaydate1 = date.getDate();
        
        int TodayMonth =date.getMonth()+1;
        
        int TodayYear = date.getYear()+1900;
        
        System.out.println(TodayYear+"년"+TodayMonth+"월"+Todaydate1+"일");
        System.out.println();
        int TodayTime = date.getHours();
        int TodayMinute = date.getMinutes();
        int TodaySecond = date.getSeconds();
        System.out.println();
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d",
            date.getHours(),date.getMinutes(),
            date.getSeconds(),TodayTime,TodayMinute,TodaySecond);
            
    }
    }


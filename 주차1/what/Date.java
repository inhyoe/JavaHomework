package 주차1.what;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        int currentHour = date.get(Calendar.HOUR);
        System.out.println("현재시간은"+currentHour);
        if(currentHour< 11){
            System.out.println("Good Morning");
        }else if(currentHour<15){
            System.out.println("Good afternoon");
        }else if(currentHour<20){
            System.out.println("Good evening");
        }else{
            System.out.println("Good Night");
        }
    }
}

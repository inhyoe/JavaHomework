package 주차5.숙제;

public class HW_01 {
    public static void main(String[] args) {
        MyDate pd = new MyDate();
        pd.year = 2012;
        pd.month = 7;
        pd.monthly = "July";
        pd.day = 12;
        System.out.println(pd.print1());
        System.out.print(pd.print2());
    }
}
class MyDate{
    int year;
    int month;
    int day;
    String monthly;
    String print1(){
        return (year +"."+month +"."+ day);
    }
    String print2(){
        return (monthly +" "+ day +","+ year);
    }
}

package 주차5.실습;
import java.util.Date;

class Time{
    private int h,m,s; // 필드
    public Time(){ // 기본 생성자
        Date today = new Date();
        h = today.getHours(); 
        m = today.getMinutes(); 
        s = today.getSeconds(); 
    }
    public int getH(){return h;}
    public int getM(){return m;} // 접근자
    public int gets(){return s;}
    
    public void setH(int h){this.h = h;}
    public void setM(int m){this.m = m;}
    public void setS(int s){this.s = s;} // 설정자

    public Time(int h,int m,int s){
        this.h = h; // 생성자 오버로딩
        this.m = m;
        this.s = s;
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", h ,m ,s);
    }
    
}

public class Overloading {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time = new Time(11, 43, 9);
        System.out.println(time);
      
    }
}

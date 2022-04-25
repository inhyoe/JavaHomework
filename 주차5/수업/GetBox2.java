package 주차5.수업;

class Box{
    private int w,h,d; // 필드

    public Box(){ w=h=d=0; } // 기본 생성자. 
    public Box( int w,int h,int d){ 
        // 생성자의 매개변수가 다르므로 괜찮다(생성자 오버로딩).
        this.w =w;
        this.h =h;
        this.d =d;
    }
    int volume(){
        return w*h*d;
    }
    int area(){ // 메서드
        return (w*d+w*h+d*h)*2;
    }
}
public class GetBox2 {
    
    static int area(int w,int h, int d){
        int area = (w*h+w*d+h*d)*2;
        return area;
    }

    static int volume(int w,int h,int d){
        int volume = w*h*d;
        return volume;
    }
    // -> 절차지향 전달값을 따로 받아야함. 32줄처럼 한번에 받지 못함.
    // public String toString()
    public static void main(String[] args) {
       
        int w = 10;
        int h = 20;
        int d = 30;
        Box myBox = new Box(w,h,d); // 기본생성자 생성
        System.out.println(myBox.area());
        System.out.println(myBox.volume());
    }
}
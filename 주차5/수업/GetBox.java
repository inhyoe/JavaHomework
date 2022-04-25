package 주차5.수업;

class Box{
    private int w,h,d; // 필드

    public Box(){ w=h=d=0; } // 기본 생성자. 
    public Box( int w,int h,int d){
        this.w =w;
        this.h =h;
        this.d =d;
    }

    public int getW(){return w;}
    public void setW(int w){this.w = w;}
    public int getH(){return h;}
    public void setH(int h){this.h = h;}
    public int getD(){return d;}
    public void setD(int d){this.w = d;}


    int volume(){
        return w*h*d;
    }
    int area(){ // 메서드
        return (w*d+w*h+d*h)*2;
    }
}
public class GetBox {
    
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
        // int width = 10;
        // int height = 20;
        // int depth = 30;
        // System.out.println(area(width, height, depth));
        // System.out.println(volume(width, height, depth));
        Box myBox = new Box(); // 기본생성자 생성
        // myBox.w = 10;
        // myBox.h = 20;
        // myBox.d = 30;
        myBox.setW(10);
        myBox.setH(20);
        myBox.setD(30);
        System.out.println(myBox.area());
        System.out.println(myBox.volume());



    }

    
    // 동작은 값을 입력하는 것
    // 상태는 값을 입력받는 것
    
}

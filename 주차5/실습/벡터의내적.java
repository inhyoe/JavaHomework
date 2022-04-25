package 주차5.실습;

class Vector2D{
    private int x,y;
    public Vector2D(){
        // 중복적인게 있다면 기본생성자 먼저 만들어줘야 함.
    }
    public Vector2D(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        
        return String.format("(%d,%d)", x, y);
    }

    public double length(){
         return Math.sqrt(x*x+y*y); // 동작
    } 
    
    public static double length(Vector2D v){
        return Math.sqrt(v.x*v.x+v.y*v.y); // 동작
    } // 필드를 사용하기 때문에 v.x를 사용해줘야함. 
    
    public Vector2D add(Vector2D v){
        // Vector2D temp = new Vector2D(x+v.x,y+v.y);
        return new Vector2D(x+v.x,y+v.y); // 동작
    }

    public static Vector2D add(Vector2D v1,Vector2D v2){
        // Vector2D temp = new Vector2D(x+v.x,y+v.y);
        return new Vector2D(v1.x + v2.x , v1.y + v2.y); // 동작
    }

    public int mult(Vector2D v){
        return x*v.x+this.y*v.y; // 동작
    }

 
}


public class 벡터의내적 {
    public static void main(String[] args) {
        // 벡터 1 = (1,2) 
        // 벡터 2 = (2,3)
        // 벡터 합 = (3,5)
        // 벡터 1내적=  8 (1*2 + 2*3) 스칼라
        // Vector2D a = new Vector2D();
        // System.out.print(a.length(10, 20));
        Vector2D v1 = new Vector2D(1,2);
        Vector2D v2 = new Vector2D(2,3);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.add(v2));
        System.out.println(v1.mult(v2));
        System.out.println(Vector2D.add(v1, v2));
    }
}


   // public int getV1() {
    //     return v1;
    // }
    // public int getV2() {
    //     return v2;
    // }
    // public int getV3() { 접근자
    //     return v3;
    // }
    // public int getV4() {
    //     return v4;
    // }
    // public void setV1(int v1) {
    //     this.v1 = v1; 설정자
    // }
    // public void setV2(int v2) {
    //     this.v2 = v2;
    // }
    // public void setV3(int v3) {
    //     this.v3 = v3;
    // }
    // public void setV4(int v4) {
    //     this.v4 = v4;
    // }
    // public int mult(int v1,int v2,int v3,int v4){
    //     int mult = v1*v3+v2*v4;
    //     return mult;
    // }
    // public double length(int v1,int v2){
    //     double length = (v1*v2);
    //     return Math.sqrt(length);
    // }
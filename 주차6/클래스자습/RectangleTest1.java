package 주차6.클래스자습;



public class RectangleTest1 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(100,30);
        Rectangle1 r2 = new Rectangle1(200,10);
        int result = r1.compateTo(r2);
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
        if(result == 1)
            System. out.println(r1 + "가 더  큽니다");
        else if(result == 0)
            System.out.println("Same");
        else{
            System.out.println(r2+"가 더 큽니다");
        }        
    }
        
    
}

class Rectangle1{
    private int width = 0;
    private int height = 0;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("넓이는 : %s, 높이는 : %s ", width,height)
    }

    public Rectangle1(int w, int height){
        this.width =w;
        this.height =height;
    }

    public int getArea1(){
        return width * height;
    }
    
    public int compateTo1(Object other){
        Rectangle1 otherRect = (Rectangle1) other;
        if(this.getArea1() < otherRect.getArea1())
            return -1;
        else 
            return 1;
        else if (this.getArea1() > otherRect.getArea1())
            return 0;
    }
}

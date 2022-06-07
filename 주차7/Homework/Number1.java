import java.util.ArrayList;
import java.util.List;

/* 
타입 매개 변수 T를 가지는 클래스 MyMath를 작성하여 보자.
 MyMath에는 평균을 구하는 getAverage() 메소드를 추가하여 보자.
  Integer나 Double과 같은 다양한 타입의 데이터에 대하여 평균을 구할 수 있도록 하라.  */
public class Number1 {
    public static void main(String[] args) {
        MyMath<Integer> math = new MyMath();
        math.add(50);
        math.add(60);
        math.add(70);

        MyMath<Double> math2 = new MyMath();
        math2.add(40.1);
        math2.add(40.2);
        math2.add(40.3);
        
        System.out.println(math.getAverage());
        System.out.println(math2.getAverage1());
    }
}

class MyMath <T>{
  List<T> list = new ArrayList<>();
  public void add(T item){
    list.add(item);
  }

  public int getAverage(){
    int sum = 0;
    int avg = 0;
    for(int i =0; i<list.size()-1; i++){
      sum = sum + (Integer)list.get(i);
    }
    avg = sum/list.size();
    return avg;
  }

  public double getAverage1(){
    double sum = 0;
    double avg = 0;
    for(int i =0; i<list.size()-1; i++){
      sum = sum + (Double)list.get(i);
    }
    
    
    avg = sum/list.size();
    return avg;
  }


  /*   private T[] a;
  
    public void setA(T[] a) {
        this.a = a;
    }
   */


  // public <T> T mygener(){
  //   T sum = 0;
  //   T avg = 0;
  //   for(int i =0; i<list.size()-1; i++){
  //     sum = sum + (Integer)list.get(i);
  //   }
  //   avg = sum/list.size();
  //   return avg;
    
  // }
} 

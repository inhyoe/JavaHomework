package 주차5.실습;

public class Car {
    private String model;
    private String color;
    private int speed;  
    private int id;
   private static int numbers = 0; 
   public Car(){};
    public Car(String m, String c, int s) {
          model = m;   
          color = c;
          speed = s;
          id = ++numbers;
    }
    public String getmodel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public static int getNumberOfCars() {
          return numbers; 
    }
    // 메소드 안에서 field를 사용하면 static을 사용할 수 없다.
}
class CarTest {
    public static void main(String args[]) {
         Car c1 = new Car("S600", "white", 80); 	
        Car c2 = new Car("E500", "blue", 20); 	
        Car c3 = new Car("E500", "blue", 20);
        Car c = new Car();
        int n = Car.getNumberOfCars();	
        System.out.println("지금까지 생성된 자동차 수 = " + n);
        c.setModel("E222");
        
        System.out.println(c.getmodel());
    }
}

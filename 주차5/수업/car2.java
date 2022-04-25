package 주차5.수업;

public class car2 {
    String color;
    int speed;
    int gear;

    public String toString(){
        return String.format("Car [ color = %s, speed = %s, gear = %s]", color,speed,gear);
    }
    void changeGear(int g){ gear = g;}
    void speedUp(){
        speed = speed + 10;
    }
    void speedDown(){
        speed = speed -10;
    }
}

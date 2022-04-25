package 주차5.수업;

public class GetCar {
    public static void main(String[] args) {
        car2 myCar = new car2();

        myCar.changeGear(2);
        myCar.speedUp();
        myCar.speedUp();
        myCar.speedDown();
        myCar.toString();
        System.out.println(myCar.toString());
        System.out.println(myCar);
    }
}

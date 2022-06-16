public class 다형성3 {
public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		HybridCar h1 = new HybridCar();

		v1.displayInfo();
		System.out.println();
		c1.displayInfo();
		System.out.println();
		h1.displayInfo();

		System.out.println();
		System.out.println();

		Vehicle car1 = new Car();
		Vehicle car2 = new HybridCar();
		Car car3 = new HybridCar();

		car1.displayInfo();
		System.out.println();
		car2.displayInfo();
		System.out.println();
		car3.displayInfo();

    //		HybridCar car4 = new Vehicle();

}
}
class Vehicle {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void displayInfo() {
		System.out.println("--- Vehicle 정보 ---");
		System.out.println("speed : " + speed);
	}
}

class Car extends Vehicle {
	int oil;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	@Override
	public void displayInfo() {
		System.out.println("--- Car 정보 ---");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + oil);
	}
}

class HybridCar extends Car {
	int electricity;

	public int getElectricity() {
		return electricity;
	}

	public void setElectricity(int electricity) {
		this.electricity = electricity;
	}

	@Override
	public void displayInfo() {
		System.out.println("--- HybridCar 정보 ---");
		System.out.println("speed : " + getSpeed());
		System.out.println("oil : " + getOil());
		System.out.println("electricity : " + electricity);
	}
}

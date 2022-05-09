package 주차6.수업;

class Car{
    private String model;

    public Car(String model){
        this.model = model;
    }
    public boolean equals(Object obj){
        if(obj instanceof Car)
            return model.equals(((Car)obj).model);
        elseㅌ
            return false;
    }
}


public class CarTest {
    
}

package Generic;

class Box<T>{
    private T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
}

public class TypeTest {
    Box<String> b1 =new Box<String>();
    
   


}


public class P_20_Generic_Box {
    public static void main(String[] args) {
        Box<String> b = new Box<String>();
        Box<Integer> c = new Box<Integer>();
        b.setData("MyData");
        c.setData(12);
        System.out.println( "String Data : " + b.getData() + "\nInteger Data : " + c.getData());

    }
}

class Box<T>{
    private T data;
    public void setData(T data) {
        this.data = data;
    }
    public T getData(){
        return data;
    }
}
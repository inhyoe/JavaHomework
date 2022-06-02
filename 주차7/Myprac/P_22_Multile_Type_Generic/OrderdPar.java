public class OrderdPar {
    public static void main(String[] args) {
        MyPar<String,Integer> p1 = new MyPar("Man", 20);
        MyPar<String,Integer> p2 = new MyPar("Woman", 40);

        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
        
    }
}


class MyPar< T, V >{
    private T key;
    private V value;

    public MyPar(T key, V value){
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
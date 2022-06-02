public class P22 {
    public static void main(String[] args) {
        OrderdPair<String,String> p1 = new OrderdPair<String, String>("Java","Programing");
        OrderdPair<String,Integer> p2 = new OrderdPair("MyKey", 123456);
        System.out.println(p2.getKey() + " " + p2.getValue());
        System.out.println(p1.getKey() + " " + p1.getValue());
    }
}

class OrderdPair<K,V>{
    private K key;
    private V value;

    OrderdPair(K key, V value){
        this.key = key;
        this.value =value;
    }

    public K getKey(){return key;}
    public V getValue(){return value;}
}

public class P19 {
    public static void main(String[] args) {
     Box b = new Box();
     b.set("Hello World");
     String s = (String)b.getData();
     b.set(new Integer(10)); 
     int i = (Integer)b.getData();
     System.out.println(s);
     System.out.println(i);

     Box2<String> d = new Box2<String>();
     d.set("NewData");
     Box2<Integer> c = new Box2<Integer>();
    c.set(123);
    String box2 = (String)d.get();
    int boxint = c.get();
    System.out.println(box2);
    System.out.println(boxint);
    }
}

class Box{
    private Object data;

    public void set(Object data){ this.data = data;}
    
    public Object getData() {
        return data;
    }
}

class Box2<T>{
    private T data;
    public void set(T data){
        this.data = data;
    }

    public T get(){
        return data;
    }
}
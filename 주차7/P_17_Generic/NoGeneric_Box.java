public class NoGeneric_Box {
    public static void main(String[] args) {
        OneBox b = new OneBox();
        b.set("Hello World");
        String s = (String)b.get();
        System.out.println(s);
        b.set(new Integer(10));
        Integer i = (Integer)b.get();
        System.out.println(i);
    }
}


class OneBox{
    private Object data;
    public void set(Object data) {
        this.data = data;
    }
    public Object get() {
        return data;
    }
}
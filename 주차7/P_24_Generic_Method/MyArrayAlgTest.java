public class MyArrayAlgTest {
    public static void main(String[] args) {
        String[] language = {"C++","C#","JAVA"};
        MyArrayAlg arr = new MyArrayAlg();
        
        System.out.println(arr.getLast(language));
    }
}


class MyArrayAlg{
    public static <T> T getLast(T[] a){
        return a[a.length -1];
    }
}
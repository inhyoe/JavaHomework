public class P23 {
    public static void main(String[] args) {
        String[] language = { "C++", "C#", "JAVA" };
            String last = MyArrayAlg.getLast(language); // last는 “JAVA"
            System.out.println(last);
    }
}

class MyArrayAlg{
    public static <T> T getLast(T[] a){
        return a[a.length - 1];
    }
}
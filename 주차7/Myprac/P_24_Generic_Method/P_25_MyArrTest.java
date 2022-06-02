public class P_25_MyArrTest {
    public static void main(String[] args) {
        String[] language = {"C++","C#","JAVA"};
        MyArryAlg.swap(language, 1,2);
        for(String value : language)
            System.out.println(value);
    }
}

class MyArryAlg{
    public static <T> void swap(T[] a,int i,int j){
        T tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
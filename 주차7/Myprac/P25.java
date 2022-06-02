public class P25 {
    public static void main(String[] args) {
        String[] language = { "C++", "C#", "JAVA" };
		MyArrayAlg.swap(language, 1, 2); 
		for(String value : language)
			System.out.println(value);
    }
}


class MyArrayAlg{
    public static <T> void swap(T[] a ,int b , int c){
        T tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;
    }
}
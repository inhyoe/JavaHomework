package Generic;
// p.24
class MyArrayAlg {
	public static <T> T getLast(T[] a) {
		return a[a.length - 1];
	}

    public static void swap(String[] language, int i, int j) {
    }
}


public class GenericMethod {
    public static void main(String[] args) {
		String[] language = { "C++", "C#", "JAVA" };
		String last = MyArrayAlg.getLast(language); // last는 “JAVA"
		System.out.println(last);
	}
}


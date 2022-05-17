import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        System.out.println("Sum = " + sumOfList(li));

        
    }

public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
}





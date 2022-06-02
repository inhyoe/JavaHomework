import java.util.Arrays;
import java.util.List;


public class P_32_WildCardTest {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3);
        List<String> ls = Arrays.asList("one","two","three");
        MyList.printList(li);
        MyList.printList(ls);
    }
}


class MyList {
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
}

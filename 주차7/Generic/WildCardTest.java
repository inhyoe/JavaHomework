import java.util.List;
import java.util.Arrays;
public class WildCardTest {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
		List<String> ls = Arrays.asList("one", "two", "three");
		MyList.printList(li);
		MyList.printList(ls);
    }

    public static void addNumbers(List<? super Integer> list){
        for(int i = 1; 1<=10; i++){
            list.add(i);
        }
    }
}
class MyList {
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.print(elem + " ");
		System.out.println();
	}
}
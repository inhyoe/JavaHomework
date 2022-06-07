package P_45_HashSet;

import java.util.HashSet;
import java.util.Set;
/* HashSet은 성능면에는 차이가 없지만, 순서가 일정하지 않음 */
/* s.add , s.set은 출력값이 true or false이다. */
public class P_47_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(); 
		set.add("Milk"); 
		set.add("Bread"); 
		set.add("Butter"); 
		set.add("Cheese"); 
		set.add("Ham"); 
		System.out.println(set.add("Ham"));
		System.out.println(set); 

    }
}

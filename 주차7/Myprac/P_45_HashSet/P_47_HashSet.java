import java.util.HashSet;
/* HashSet은 성능면에는 차이가 없지만, 순서가 일정하지 않음 */
public class P_47_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(); 
		set.add("Milk"); 
		set.add("Bread"); 
		set.add("Butter"); 
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		System.out.println(set); 

    }
}

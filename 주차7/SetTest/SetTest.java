package SetTest;

import java.util.*;

/* 결과를 보고 어떤 Set을 썼는지 구별해야함. */

public class SetTest {
    public static void main(String[] args) {
        //Set으로 선언할 수 있다.
        // Set<String> set = new HashSet<String>()
        HashSet<String> set = new HashSet<String>();
        set.add("Milk"); 
		set.add("Bread"); 
		set.add("Butter"); 
		set.add("Cheese"); 
		set.add("Ham"); 
		set.add("Ham"); 
		System.out.println(set); 
        // HashSet은 무작위이며, 중복을 허용하지 않는다.
        TreeSet<String> set2 = new TreeSet<String>();
        set2.add("Milk"); 
		set2.add("Bread"); 
		set2.add("Butter"); 
		set2.add("Cheese"); 
		set2.add("Ham"); 
		set2.add("Ham"); 
		System.out.println(set2);
        // 알파벳순으로 정렬 및 중복 허용 x
        LinkedHashSet<String> set3 = new LinkedHashSet<String>();
        set3.add("Milk"); 
		set3.add("Bread"); 
		set3.add("Butter"); 
		set3.add("Cheese"); 
		set3.add("Ham"); 
		set3.add("Ham"); 
		System.out.println(set3);
        // 삽입되었던 순서로 결정된다. 가장느림.
        
    }
}

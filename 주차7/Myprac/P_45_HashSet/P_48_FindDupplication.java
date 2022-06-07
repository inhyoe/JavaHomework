package P_45_HashSet;

import java.util.HashSet;
import java.util.Set;

public class P_48_FindDupplication {
    public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = { "단어", "중복", "구절", "중복","구절" };
		for (String a : sample){
            System.out.println(s.add(a));
			if (!s.add(a))
				System.out.println("중복된 단어 " + a);}
		System.out.println(s.size() + " 중복되지 않은 단어: " + s);
	}

}

import java.util.*;
public class FindDupplication {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        Set<String> k = new HashSet<String>();
        String[] sample = {"a","b","c","d","a","b"};
        for(String a : sample)
            if(!s.add(a)){
                System.out.println("중복된 단어 " + a);
                k.add(a);}
            System.out.println(s.size()-k.size() + "중복되지 않은 단어" + s);}
    }


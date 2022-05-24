package Map함수;

import java.*;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
          Map<String, Student4> st = new HashMap<String, Student4>();
          st.put("20090001", new Student4(20090001, "구준표"));
          st.put("20090002", new Student4(20090002, "금잔디"));
          st.put("20090003", new Student4(20090003, "윤지후"));

          // 모든 항목을 출력한다.
          System.out.println(st);

          // 하나의 항목을 삭제한다.
          st.remove("20090002");
          // 하나의 항목을 대치한다.
          st.put("20090003", new Student4(20090003, "소이정"));
          // 값을 참조한다.
          System.out.println(st.get("20090003"));
          // 모든 항목을 방문한다.
          for (Map.Entry<String, Student4> s : st.entrySet()) {
                 String key = s.getKey();
                 Student4 value = s.getValue();
                 System.out.println("key=" + key + ", value=" + value);
          }
    }
}

class Student4 {
    int number;
    String name;

    public Student4(int number, String name) {
          this.number = number;
          this.name = name;
    }

    public String toString() {
          return name;
    }
}

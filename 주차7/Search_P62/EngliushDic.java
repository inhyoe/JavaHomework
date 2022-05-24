import java.util.*;;

public class EngliushDic {
    public static void main(String[] args) {
     Map<String,String> st = new HashMap<String,String>();

     st.put("map", "지도");
     st.put("java", "자바");
     st.put("school", "학교");
     st.put("python", "파이썬");

     Scanner scan =new Scanner(System.in);
     do{
         System.out.println("영단어 입력");
         String key = scan.next();

         if(key.equals("quit")) break;
         System.out.println("영단어의 의미는" + st.get(key));
     }while(true);
    }
}

import java.util.*;

    public class Number5 {


 public static void main(String[] args) {

  HashSet <Integer> set = new HashSet<Integer>();
  int r;
  
  for(int i=0; i<6; i++){
   r=(int)(Math.random()*45)+1;
   set.add(r);
   if(set.contains(set)){    //이미 선택된것이면 다시 랜덤 돌림.
    r=(int)(Math.random()*45)+1;
    set.add(r);
   }
  }
  System.out.println("로또 번호 추출기 ");
  System.out.println(set);
 }


}

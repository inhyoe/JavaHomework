
import java.util.*;
public class StackTest {
    public static void main(String[] args) throws InterruptedException {
        int time = 10;
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int i = time; i >= 10; i --){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.remove() + " ");
            Thread.sleep(1000);
        }

        Stack<Integer> s = new Stack<Integer>();
        for(int i = 1; i <=10; i++){
            s.push(new Integer(i));
        }
        for(int i =1; i<=10; i++){
            System.out.println(s.pop());
        }
        }
}

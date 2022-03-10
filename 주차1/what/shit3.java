package JavaHomework.주차1.what;

import java.util.Scanner; 

public class shit3 {
    // 10미만 small
    // 10이상 20미만 => medium
    // 20이상 -> large
    public static void main(String[] args) {
        int a;

        System.out.print("넘버");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        
        if(a < 10){
            System.out.println("small");
        }else if(/* a>=10 &&  */a<20){ // 위의 if문이 a<10을 포함함
            System.out.println("midium");
        }else{
            System.out.println("larager");
        }
    }
}

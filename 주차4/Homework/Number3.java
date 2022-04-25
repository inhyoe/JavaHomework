package 주차4.Homework;



public class Number3 {
    public static void main(String[] args) {
        String shape[] = { "Clubs", "Dimonds", "Hearts", "Spades"};
        String num[] = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        
        int a = (int)(Math.random()*shape.length);
        
        int b = (int)(Math.random()*num.length);
        System.out.println(shape[a]+"의"+num[b]);
}
}

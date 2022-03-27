package 주차3.Homework;

public class Number6_1 {
    public static void main(String[] args) {
        // String x = "100000";
        // // int i = (x.length()-1)/3;
        // int k = 1;
        // String z ="";
        // for(int i =1; i<x.length(); i++){
        //     if(i == 3*k){

        //         z = x.substring(x.length()-1, x.length()-i)+
        //         ","+
        //         x.substring(x.length()-i-1, 0);
        //     }
        // }
        String x = "20000000";
        // int i = (x.length()-1)/3;
        
        String z =x;
        for(int i =x.length(); i>0; i -=3){
            x = x.substring(0, i) + ","+ x.substring(i,x.length());
        }
        System.out.println(x);
    }
}

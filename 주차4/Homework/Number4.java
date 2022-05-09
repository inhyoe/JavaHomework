package 주차4.Homework;

import java.util.Scanner;
import java.util.Arrays;
public class Number4 {
    public static void main(String[] args) {
        int i ,j;
        int arr[] = new int[10];
        for(i =0; i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }
        //for문을 돌려서 -> 

        int sum = 1;
        int back = 10;
        while(back <= 100){
            System.out.print(sum+"-"+ back +":");
            for(j =0; j<i;j++)
                if(arr[j]>=sum && back>=arr[j])
                    System.out.print("*");
                
            System.out.println("");
            sum += 10;
            back += 10;
            
        }
    }
}

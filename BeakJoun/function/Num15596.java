package BeakJoun.function;

import java.util.Scanner;

public class Num15596 {
    static long sum(int[] a) {
        long ans = 0;
        for(int i =0; i<a.length;i++){
            ans += a[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num;
        int x = scan.nextInt();
        num = new int[x];
        for(int i =0; i<x;i++){
            int k = scan.nextInt();
            num[i] = k;
        }        
        scan.close();
        
        sum(num);
        System.out.println(sum(num));

    }
}

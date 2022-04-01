package BeakJoun;

import java.util.Scanner;

public class Fac {
    /* public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int sum = Fac(n);
        System.out.println(sum);
    }

    static int Fac(int n){
        if(n<=1)
            return n;
        return n * Fac(n-1);
    } */
    public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = factorial(N);
		System.out.println(sum);
		
	}
	
	public static int factorial(int N) {
		if(N <= 1) return 1;	// 재귀 종료조건
		return N * factorial(N - 1);		
	}
}

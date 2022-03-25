package 주차3;

public class 수열합 {
    public static void main(String[] args) {
        System.out.println(rsum(10));
    }
    static double rsum(int n){
        
        // double a = 1;
        // double hap =1;

        // if(a == x){
        //     return 1/hap;
        // }
        // hap += 1/sum(a);
        // a++;
        
        // return hap;
        if(n ==1)
            return 1.0;
        return rsum(n-1)+ 1.0/n;
    }
}

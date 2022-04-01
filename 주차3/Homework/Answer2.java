package 주차3.Homework;

public class Answer2 {
    public static void main(String[] args) {
        int sum =0;
        for(int i =1; i<=5000; i++){
            if(isSelfN(i) == true)
            sum += i;
        }
        System.out.println(sum);
    }


    static boolean isSelfN(int n){
        boolean isSelf = true;
            for(int j=1; j<=n; j++){
                if(n == generator(j)){
                    isSelf = false;
                }
            }
            return isSelf;
    }


    static int generator(int n){
        int sum = n;
        while(n>0){
            //받을수
            sum = sum +(n % 10);
            n = n/10;
        }
        return sum;
    }
}

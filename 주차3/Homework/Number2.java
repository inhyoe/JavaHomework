package 주차3.Homework;


public class Number2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<5000; i++ ){
            
            boolean isSelf = true;
            for(int j=1; j<i; j++){
                if(i == generator(j)){
                    isSelf = false;
                }
            }
            if(isSelf == true){
                sum += i;
            }

        }
        System.out.println(sum);
        //generator(i)는 self넘버가 아니므로,
        // 
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

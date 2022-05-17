package 중간고사;
public class Test2 {
    public static void main(String[] args) {
        MyPow(3, -2);
        System.out.println(MyPow(3, -2));
    }

    static double MyPow(int a, int b){
        int sum = a;
        if(b > 0)
        for(int i =1; i<=b; i++){
            sum *=  a;
        }
        else{
            for(int i =1; i<=b*b; i++){
                sum /= a;
            }
        }
        return sum;
    }
}


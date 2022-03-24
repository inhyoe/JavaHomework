package 주차2.JavaHomework2;

public class Number5_1 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i <= 10000; i++)
            x += findEight(i);

        System.out.print(x);
    }

    static int findEight(int x) {
        if (x == 0)
            return 0;
        if (x % 10 == 8)
            return findEight(x / 10) + 1;
        else
            return findEight(x / 10);
    }

    // public static int findEight(int x){
    // int count =0;
    // while(x > 0){

    // if(x%10 == 8)count++;
    // x /=10;
    // }
    // return count;
    // }

}

package 주차4.Homework;

public class Number7_1 {
    public static void main(String[] args) {
        int[] a = new int[31];
        a[0] = 2;

        for(int i =1; i<100; i++){
            for(int j = 0; j<a.length; j++){
                a[j] *= 2;
            }
            for(int j = 0; j<a.length; j++){
                if(a[j]>= 10){
                    a[j] -= 10;
                    a[j+1]++;
                    System.out.println(a[j+1]);
                    // System.out.println(Arrays.toString(a));
                }
            }
        }
        for(int i =0; i<a.length; i++){
            System.out.print(a[a.length-i-1]); 
        }
    }
}

package 주차4.수업;

import java.util.Arrays;

public class 배열복사 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {1,2,3,4,5};
        int c[] = a;

        System.out.println(a == b); // false
        System.out.println(a == c); // true
        System.out.println(b == c); // false
        System.out.println(Arrays.equals(a, b)); // true
        System.out.println(Arrays.equals(b, c)); // true

        // 배열을 복사하는 방법

        int d[] = {1,2,3,4,5};
        int e[] = new int[d.length];

        for(int i = 0; i<d.length;i++){
            e[i] = d[i];
        }
        System.out.println(Arrays.toString(e));
        //또는

        int f[] = Arrays.copyOf(d, d.length);
        System.out.println( Arrays.toString(f) );
    }
}

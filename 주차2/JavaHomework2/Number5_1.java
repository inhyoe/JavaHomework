package 주차2.JavaHomework2;

public class Number5_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) 
        //8888
            for (int j = i; j > 0; j /= 10) 
            //8888/10 = 888ㅈ
                if (j % 10 == 8) 
                    count++;
        System.out.print(count);
    }
}

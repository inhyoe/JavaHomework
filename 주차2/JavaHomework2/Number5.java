package 주차2.JavaHomework2;

public class Number5 {
    // 8 10까지
    // 18 28 38 48 58 68 78 88(2) 98 100 까지
    // 188 288 388 488 588 688 788 888 988(2)

    public static void main(String[] args) {
        int count = 0;
        for (int j = 1; j <= 10000; j++) {
            if (j % 10 == 8) {
                if (j / 10 == 8) {
                    count += 1;
                }
                count += 1;
            }
        }
        System.out.println(count);

    }
}

package 주차4.Homework;

public class Number1 {
    public static void main(String[] args) {
        double i[] = {1.0, 2.0, 3.0, 4.0};
        double sum = 0;
        double max = 0;
        for(int k=0; k < i.length; k++){
            sum += i[k];
            if(max < i[k]){
                max = i[k];
            }
        }
        System.out.println("합은 : " + sum);
        System.out.println("최대값은 : " + max);
    }
}

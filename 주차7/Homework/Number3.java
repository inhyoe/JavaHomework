import java.util.ArrayList;
import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        ArrayList<Double> score = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double max = 0;
        double min = 10000;
        double getScore;
        for (int i = 0; i < 10; i++) {
            System.out.print("심사위원의 점수를 입력하세요 : ");
            getScore = scan.nextDouble();
            System.out.println(getScore);
            score.add(getScore);
            
            if(max < getScore) {
                max = getScore;
            }
            if (min > getScore) {
                min = getScore;
            }
            System.out.println(score);
            getScore =0;
        }
        
        for (double num : score) {
            sum += num;
        }
        System.out.println(score);
        System.out.println(sum);
    }

    static void setScore(ArrayList<Double> score) {
        double getScore;
        Scanner scan = new Scanner(System.in);
        double max = 0;
        double min = 10000;

        for (int i = 0; i < 10; i++) {
            System.out.print("심사위원의 점수를 입력하세요 : ");
            getScore = scan.nextDouble();
            System.out.println(getScore);
            score.add(getScore);
            if (max < getScore){
                max = getScore;
            }
            if (min > getScore) {
                min = getScore;
            }
            
            System.out.println(score);
        }
        score.remove(Double.valueOf(min));
        score.remove(Double.valueOf(max));
    }
}


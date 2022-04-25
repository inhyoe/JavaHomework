package 주차5.숙제;

public class tst {
    public static void main(String[] args) {
        int month = 2;
        int cnt;
        int sum=0;
        switch(month){
            case 1: case 3: case 7: case 8: case 10: case 12:
            cnt = 31;
            sum += cnt;
            break;
            case 2:
            cnt = 28;
            sum += cnt;
            break;
            default:
            cnt = 30;
            sum += cnt;
            break;
        }
        System.out.println(sum);
    }
}

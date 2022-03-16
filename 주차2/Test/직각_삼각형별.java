package 주차2.Test;

public class 직각_삼각형별 {
    public static void main(String[] args) {
        // for(int i=1; i<=5; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
        // for(int i=0; i<5; i++){
        //     for(int j=5; j>i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
            for(int i =1; i<=5; i++){
                for(int j=1; j<=5; j++){
                    if( i<=j){ // 대각선 위 영역.
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }   
}

package 중간고사;
import 주차2.Test.Factorial;

class Fraction2{
    private int ja;
    private int mo;
    public Fraction2(int ja,int mo){ 
        this.ja = ja; 
        this.mo = mo;
    };

    public Fraction2 add(Fraction2 f){
        return new Fraction2(ja*f.mo + mo*f.ja,mo*f.mo);
    }

    public Fraction2 mul(Fraction2 f){
        return new Fraction2(ja * f.ja , mo * f.mo);
    }

    public static Fraction2 add(Fraction2 f1,Fraction2 f2){
        return new Fraction2(f1.ja*f2.mo+f1.mo*f2.ja,f1.mo*f2.mo);
    }

    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }

    @Override
    public String toString() { // 필드값 이용 가능.

        return String.format("%d/%d", ja/gcd(ja,mo),mo/gcd(ja, mo));
    }
}

public class Test1_1 {
    public static void main(String[] args) {
        Fraction2 f1 = new Fraction2(1, 2);
        Fraction2 f2 = new Fraction2(2, 3);

        System.out.println(f1.add(f2));
        System.out.println(f1.mul(f2)); // 객체지향 
        System.out.println(Fraction2.add(f1,f2)); // 절차지향
        // System.out.println(Fraction2.gcd(4, 8));
    }
}



/* 

분수 클래스 : Fraction
- ja : int
- mo : int

------------------------------------

+ 생성자 중복정의
+ toString : String
*/
/*
		 * 분수클래스 Fraction
		 * - ja : int
		 * - mo : int
		 * —————
		 * + 생성자 중복정의
		 * + toString: String
		 * + add(Fraction f) : Fraction
		 * + mul(Fraction f) : Fraction
		 * + add(Fraction f1, Fraction f2) : static Fraction
		 * .. static: 필드사용X, 객체생성 없이 호출 가능!
		 * .. 
		 * - gcd(int a, int b) : static int
		 * —————
		 * 1/2 + 2/3 = 7/6
		 * 1/2 * 2/3 = 2/6 = 1/3
*/
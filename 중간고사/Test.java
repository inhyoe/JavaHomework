package 중간고사;
public class Test {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2);
        Fraction f2 = new Fraction(2,3);
        Fraction f3,f4;
        
        f3 = f1.add(f2);
        f4 = Fraction.mul(f1, f2);
        System.out.println(f3);
        System.out.println(f4);


    }
}

class Fraction{
    int ja;
    int mo;

    public void setJa(int ja) {
        this.ja = ja;
    }

    public int getJa(int ja){
        return ja;
    }

    public void setMo(int mo) {
        this.mo = mo;
    }
    
    public int getMo() {
        return mo;
    }

    Fraction(){
        int ja = 1;
        int mo = 2;
    }
    
    Fraction(int j, int m){
        ja = j;
        mo = m;
    }
    public Fraction add(Fraction f){
        return new Fraction((ja*f.mo+f.ja*mo)/gcd(ja*f.mo+f.ja*mo, mo *f.mo) ,(mo *f.mo)/gcd(ja*f.mo+f.ja*mo, mo *f.mo));
    }


    static Fraction mul(Fraction f1, Fraction f2){
        return new Fraction((f1.ja * f2.ja)/gcd(f1.ja * f2.ja, f1.mo * f2.mo),
         (f1.mo * f2.mo)/gcd(f1.ja * f2.ja, f1.mo * f2.mo));
        
    }

    static int gcd(int x, int y){
        int r;
        while(y !=0){
            r = x%y;
            x =y;
            y =r;
        }
        return x;
    }

    public String toString(){
        return String.format("%d/%d", ja,mo);
    }
}
// static과 non-static의 차이 : 필드의 사용 유무.
// 인스턴스메소드 일반 메소드


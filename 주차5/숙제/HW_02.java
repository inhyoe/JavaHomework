package 주차5.숙제;

public class HW_02  {
    public static void main(String[] args) {
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(3,4);
        Complex c3 = new Complex(5,6);
        c1 = c1.add(c2);
        c2 = c2.mulComplex(c3);
        System.out.println("add = "+c1);
        System.out.println("Multi = "+c2);
        System.out.println("Abs = " + c3.abs());
    }
}

// 시험문제관련

class Complex{
    private double r;
    private double i;
    Complex(double r,double i){
        this.r = r;
        this.i = i;
    }
    public Complex add(Complex c){
        return new Complex(this.r+c.r,this.i+c.i);
    }
    public Complex mulComplex(Complex c) {
		Complex c0 = new Complex(0,0);
		c0.r = r * c.r - i * c.i;
		c0.i = r * c.i + i * c.r;
		return new Complex(r*c.i+i*c.r,r*c.r-i*c.i);
	}
    public double abs(){
        return Math.sqrt(r*r+i*i);
    }
    
    public String toString(){
        if(i<0){
            return String.format("%s%si", r,i);
        }
        else{
            return String.format("%s+%si", r,i);
        }
    }
}
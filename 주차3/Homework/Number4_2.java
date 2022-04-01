package 주차3.Homework;

public class Number4_2 {
	public static void main(String[] args) {
		
		
		int n = getInt("10000000001");
		System.out.println(n);
	}
	
	public static int getInt(String str) {
	
		int sum = 0;
		if(str.length()==1)
			return Integer.parseInt(str);
		int pow = (int)Math.pow(2, str.length()-1);
		int value = Integer.parseInt(str.substring(0,1));
		if(value == 1)
			value = pow;
		
		sum = value + getInt(str.substring(1));
		return sum;
	}
	
}
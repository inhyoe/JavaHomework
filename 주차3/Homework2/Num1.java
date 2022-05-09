package 주차3.Homework2;

public class Num1 {
    public static void main(String[] args) {
		int n, max = -1;
		
		for(int i = 900; i <= 1000; i++) {
			n = cycle(i);
			if(n > max)
				max = n;
		}
		System.out.println("가장 긴 사이클의 길이: " + max);
		
	}
	static int cycle(int n) { // 정수 n의 사이클 길이 반
		int cnt = 1;
		while(n != 1) {
			if(n%2 == 0)
				n/=2;
			else
				n = n * 3+1;
			cnt++;
		}
		return cnt;
	}

}

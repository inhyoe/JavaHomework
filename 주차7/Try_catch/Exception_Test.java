package Try_catch;
import java.io.IOException;

public class Exception_Test {
    public static void main(String[] args) {
		System.out.println(readString());
	}
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오:");
		try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
		return new String(buf);
        //try catch를 사용해서 ioeException
	}

}

class Second_Test{
    public static String readString2() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오:");
        System.in.read(buf);
		return new String(buf);
        //throw Error
    }
}

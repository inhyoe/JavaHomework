import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharEncodingTest {
	public static void main(String[] args) throws IOException {
		FileWriter outputStream = null;
		try {
			File fileDir = new File("./P_17_CharEncodingTest/input.txt");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(fileDir), "UTF8"));

			outputStream = new FileWriter("./P_17_CharEncodingTest/output.txt");
			String str;
			while ((str = in.readLine()) != null) {
				outputStream.write(in.read());
				System.out.println(str);
			}
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}

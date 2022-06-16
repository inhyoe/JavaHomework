import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P_9_SimplePair {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("./P_09_CopyFile1/input.txt");
            out = new FileOutputStream("./P_09_CopyFile1/output.txt");
            int c;
            // ascii code 10진법
            System.out.println(in.read());
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) 
                in.close();
            if (out != null) 
                out.close();
        }
    }
}

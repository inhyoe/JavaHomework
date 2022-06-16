import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P_13_CopyFile2 {
    public static void main(String[] args) throws IOException{
        FileReader inputStream = null;

        FileWriter outputStream = null;

        try{
            /* 경로는 기본적으로 프로젝트폴더임 */
            inputStream = new FileReader("./P_13_CopyFile2/input.txt");
            outputStream = new FileWriter("./P_13_CopyFile2/output.txt");

            int c;
            while((c = inputStream.read()) != -1){
                outputStream.write(c);
                System.out.println((inputStream.read()));
                // System.out.print((char)(c));
            }
        }finally{
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }

        }
    }
}

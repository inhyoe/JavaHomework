package Num1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Num8_1_Homework {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("./JVH/Num1/input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("./JVH/Num1/output2.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>(); // in 값을 저장하고 정렬

        try {
            while (in.hasNext()) // in에 다음 값이 있을 경우 계속 반복
            {
                list.add(in.nextInt()); // list에 in 값을 하나씩 저장
            }
            Collections.sort(list); // list를 정렬

            for (int i : list) {
                out.println(i); // out(input2)에 정렬한 list값 저장
            }
        } finally {
            in.close();
            out.close();
        }
    }
}
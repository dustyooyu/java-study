package org.example.Week4.Day17_230510;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SplittableRandom;

public class TrianglePrinter {
    public String makeALine(int h, int i){
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    // 파일에 출력하는 메서드. String배열을 받아서 BW로 출력한다.
    public void pirntToFile(String[] lines) throws IOException {
        BufferedWriter bw = new BufferedWriter((new FileWriter("./printFile.txt")));
        bw.append("test");
        bw.flush();
        bw.close();
    }
}

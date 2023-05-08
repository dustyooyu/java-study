package org.example.CodeUp.num80;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class CodeUp1084Re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] rgb = br.readLine().split(" ");
        int count = 0;
        for (int r = 0; r < Integer.parseInt(rgb[0]); r++) {
            for (int g = 0; g < Integer.parseInt(rgb[1]); g++) {
                for (int b = 0; b < Integer.parseInt(rgb[2]); b++) {
                    bw.write(r + " " + g + " " + b + "\n");
                    count++;
                }
            }
        }
        bw.flush(); // 버퍼에 있던 내용 전부 출력함
        System.out.printf("%d", count);
    }
}

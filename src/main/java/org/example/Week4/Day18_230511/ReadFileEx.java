package org.example.Week4.Day18_230511;

import java.io.BufferedReader;
import java.io.FileNotFoundException; // 파일이름 틀릴 경우 예외처리
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ReadFileEx {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("C:\\병원정보서비스202210.csv", Charset.forName("EUC-KR")));
        // EUC-KR 인코딩인 파일의 경우 기본 인코딩으로 설정된 UTF-8로 읽어오게 되면 글자가 깨져 나온다.
        // Charset 클래스의 forName 메서드로 파일을 읽어올 인코딩을 지정해주어 처리한다.

        BufferedReader br = new BufferedReader(new FileReader("C:\\hospital_info_0920_utf8.csv"));
        // 파일의 인코딩을 UTF-8로 직접 변환하여 저장한 후 불러왔다.

        System.out.println(br.readLine());
        // BufferReader의 readLine 메서드를 통해 한줄을 읽어온다.
    }
}
// 한글 인코딩 문제


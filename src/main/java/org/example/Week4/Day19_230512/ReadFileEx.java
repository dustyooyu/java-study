package org.example.Week4.Day19_230512;

import org.example.Week4.Day18_230511.Adress;
import org.example.Week4.Day18_230511.Hospital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader선언 --> File연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        // System.out.println(str); // parse하기 전 str 내용 출력해보기
        // 아래는 parse
        String[] splitted = str.split(",");
        // System.out.println(Arrays.toString(splitted)); // 출력해보기
        Adress adress = new Adress(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], adress);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rf = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rf.getLines("hospital_info_0920_utf8_line9.csv");
//        List<String> parseHospital = rf.getLines("hospital_info_0920_utf8_line9.csv");
        List<Hospital> paresedHospital = rf.getHospitals(strLines);
        for (int i = 0; i < paresedHospital.size(); i++) {
            Hospital hospital = paresedHospital.get(i);
            System.out.printf("%s %s\n", hospital.getName(), hospital.getWebsitAddr());
        }
    }
}
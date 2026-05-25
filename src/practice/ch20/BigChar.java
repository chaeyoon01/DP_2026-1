package practice.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata;

    // 생성자 
    public BigChar(char charname) { // ex) '3'
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt";    // ex) big3.txt
            StringBuilder sb = new StringBuilder();

            for (String line: Files.readAllLines(Path.of(filename))) {  // 각 줄을 읽어서 리스트 생성
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}

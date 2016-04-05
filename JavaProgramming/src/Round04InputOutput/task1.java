package Round04InputOutput;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-03.
 */
//하나의 문자를 입력받아 그것의 char형 문자와 아스키 코드 값을 표시하는 예제를 만들어 보자
public class task1 {
    public static void main(String[] ar) throws IOException {
      System.out.print("키보드에서 아무거나 하나만 누르고 Enter키를 누르세요:");
        char ch = (char)System.in.read();
        System.out.println(ch + "=" +(int)ch);
    }
}

package Round04InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex09BufferedReader {
    public static void  main(String[] ar) throws IOException {
        //문자열 입력을 위한 포맷 지정 BufferedReader는 문자열을 받는다. 숫자열은 문자열을 변환함.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String name = ""; //name 변수의 선언과 초기화
        System.out.print("이름을 입력하세요 :");
        name = in.readLine();
        System.out.println("당신이 입력하신 이름은 " + name + "입니다.");
    }
}

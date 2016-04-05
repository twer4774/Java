package Round04InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex09BufferedReaderInteger {
        public static void  main(String[] ar) throws IOException {
            //문자열 입력을 위한 포맷 지정 BufferedReader는 문자열을 받는다. 숫자열은 문자열을 변환함.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("나이를 입력 하세요:");
            String imsi = in.readLine();
            int age = Integer.parseInt(imsi); //입력 문자열을 숫자로 변환
            /* int age = Integer.parseInt(in.readLine()); 으로 해도 됨.*/
            System.out.println("입력된 나이는 " + age + "입니다.");
    }
}

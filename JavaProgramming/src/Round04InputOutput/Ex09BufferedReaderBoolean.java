package Round04InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex09BufferedReaderBoolean {
        public static void  main(String[] ar) throws IOException {
            //문자열 입력을 위한 포맷 지정 BufferedReader는 문자열을 받는다. 숫자열은 문자열을 변환함.
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("boolean 자료를 입력 하세요:");
            String imsi = in.readLine();
            boolean bool = Boolean.valueOf(imsi).booleanValue(); //불리안 자료형이 입력되는부분 암기!!
            System.out.println("입력된 boolean형 자료의 값은 " + bool + "입니다.");
    }
}

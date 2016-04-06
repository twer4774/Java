package Round04InputOutput;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex06Exception2 {
    public static void  main(String[] ar) throws IOException {
        System.out.print("입력= ");
        int aa = System.in.read(); //System.in.read()는 아스키코드값으로 입력된다.
        System.out.println("입력된 아스키 값은 " + aa + "입니다.");
    }
}

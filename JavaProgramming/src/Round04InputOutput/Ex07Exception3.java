package Round04InputOutput;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex07Exception3 {
    public static void  main(String[] ar) throws IOException {
        System.out.print("입력 1="); //println이 아님을 주의.
        char aa = (char)System.in.read();
        System.in.read(); //엔터키를 '\r'로 받아 처리하는 부분
        System.in.read(); //엔터키를 '\n'로 받아 처리하는 부분
        System.out.print("입력 2=");
        int bb = System.in.read() - 48; //숫자만 입력가능
        System.out.println("입력된 문자는 " + aa + "입니다.");
        System.out.println("입력된 숫자는 " + bb + "입니다.");
    }
}

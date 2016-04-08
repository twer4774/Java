package Round06;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-06.
 */
//문자 하나를 입력받아 대문자인지 소문자인지 구별하는 프로그램을 작성해 보자.
public class task1 {
    public static void main(String[] ar) throws IOException {

        char a = 0;

        System.out.print("문자 하나를 입력하세요:");
        a = (char)System.in.read();

        if(a>=65 && a<=90){
            System.out.println("대문자");
        }else if(a>=97 && a<=122){
            System.out.println("소문자");
        }
    }
}

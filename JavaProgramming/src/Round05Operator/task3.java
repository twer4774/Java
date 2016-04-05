package Round05Operator;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-03.
 */
//문자 하나를 입력받아 그 문자가 산술 연산자인지 아닌지를 판단하는 프로그램을 만들어보자
public class task3 {
    public static void main(String[] ar) throws IOException {
        System.out.print("산술 연산자를 입력하세요.('+', '-', '*', '/', '%'): ");
        char a = (char)System.in.read();
        if(a=='+' | a=='-' | a=='*' | a=='/' | a=='%'){
            System.out.println(a+"는 산술연산자입니다.");
        }
        else{
            System.out.println(a+"는 산술연산자가 아닙니다.");
        }
    }
}

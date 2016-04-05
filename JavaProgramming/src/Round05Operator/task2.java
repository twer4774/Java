package Round05Operator;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-03.
 */
//숫자 하나를 입력받아 그 수가 1이면 "남성", 2이면 "여성"이라는 글자를 출력하는 프로그램을 만들어보자.
public class task2 {
    public static void main(String[] ar) throws IOException {
        System.out.print("남성 1, 여성 2 입력:");
        int a = System.in.read()-48;
        System.out.println(a==1 ? "남성" : "여성");
    }
}

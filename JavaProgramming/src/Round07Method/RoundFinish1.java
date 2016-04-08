package Round07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//계산기프로그램의 메소드화
public class RoundFinish1 {
    public static float aaa(char z, int x, int y){
        int result = 0;
        switch (z){
            case '+': result = x + y; break;
            case '-': result = x - y; break;
            case '*': result = x * y; break;
            case '/': result = x / y; break;
            default: System.out.println("잘못된 연산자");
                System.exit(-1); //프로그램 종료
        }
        return result;
    }
    public static void main(String[] ar) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, b = 0; // 초기화
        char yon = 0; // 연산자 초기화

        System.out.print("첫번째수:");
        a = Integer.parseInt(in.readLine());
        System.out.print("연산자:");
        yon = (char)System.in.read();
        System.in.read();
        System.out.print("두번째수:");
        b = Integer.parseInt(in.readLine());

        System.out.println("결과는 " + aaa(yon,a,b));
    }
}

package Round07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//문자열 입력 범용 메서드
public class RoundFinish2 {
    public static String getString(String str) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.print(str + "=");
        String temp = in.readLine();
        return temp;
    }
    public static void main(String[] ar) throws IOException {
        String name = getString("이름");
        System.out.println(name + "님 안녕하세요!");
    }
}

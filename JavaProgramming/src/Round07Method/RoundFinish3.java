package Round07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//특정 수 입력받는 범용 메서드
public class RoundFinish3 {
    public static int getInt(String str) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(str + "=");
        int temp = Integer.parseInt(in.readLine());
        return temp;
    }

    public static void main(String[] ar) throws IOException {
        int kor = getInt("국어");
        System.out.println("국어점수 :" + kor);
    }
}

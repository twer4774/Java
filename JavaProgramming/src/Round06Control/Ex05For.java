package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//두 수 사이의 합
public class Ex05For {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, b = 0;
        int sum = 0;

        System.out.print("첫번째수:");
        a = Integer.parseInt(in.readLine());
        System.out.print("두번째수:");
        b = Integer.parseInt(in.readLine());

        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }

        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }

        }
        System.out.println("두 수사이의 합은 :" + sum);
    }
}

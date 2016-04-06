package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//두개의 수와 배수 n을 입력받아 두 수 사이의 n배수의 합을 구하는 프로그램
public class Ex06For2 {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a, b, sum=0;
        int basu = 0;

        System.out.println("첫 번째 수:");
        a = Integer.parseInt(in.readLine());
        System.out.println("두 번째 수:");
        b = Integer.parseInt(in.readLine());
        System.out.println("배수:");
        basu = Integer.parseInt(in.readLine());

        if(a < b){
            for(int i=a; i<=b; i++){
                if(i%basu==0){
                    sum += i;
                }
            }
        } else if(a > b){
            for(int i=b; i<=a; i++){
                if(i%basu==0){
                    sum += i;
                }
            }
        }

        System.out.println("두 수사이의 배수의 합은" + sum);
    }
}

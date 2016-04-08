package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//앞서 배운 계산기 프로그램을 만들어서 한번 계산을 한 후 다시 계산을 할 것인지 물어보고
// 수행을 계속할 것인지를 결정하는 프로그램을 만들어보자.
public class task5 {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a, b, result = 0; // 초기화
        char x = 0; // 연산자 초기화
        while(true)
        {
            System.out.print("첫번째수:");
            a = Integer.parseInt(in.readLine());
            System.out.print("연산자:");
            x = (char) System.in.read();
            System.in.read();
            System.out.print("두번째수:");
            b = Integer.parseInt(in.readLine());

            switch (x) {
                case '+' :
                    result = a + b;
                    break;
                case '-' :
                    result = a - b;
                    break;
                case '*' :
                    result = a * b;
                    break;
                case '/' :
                    result = a / b;
                    break;
                default:
                    System.out.println("잘못된 연산자");
                    System.exit(-1); //프로그램 종료
            }

            System.out.println(a + "" + x + "" + b + "결과는: " + result);
            //주의!! 그냥 x를 출력하면 아스키코드로 인식하므로 문자열로 인식할 수 있도록 x 앞뒤에 "" 문자열 넣음!
            char s = 0;
            do{
               System.out.println("계속할래? y/n");
               s = (char) System.in.read();
           }while(!(s=='y'|| s=='n'));
             if(s=='n'){break;}
        }
        System.out.println("계산종료");
    }
}

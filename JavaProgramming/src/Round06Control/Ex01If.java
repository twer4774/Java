package Round06;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
public class Ex01If {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int firstsu = 0, secondsu = 0;

        System.out.println("첫번째 수 = ");
        firstsu = Integer.parseInt(in.readLine());

        System.out.println("두번째 수 = ");
        secondsu = Integer.parseInt(in.readLine());

        if(firstsu > secondsu){
            System.out.print("첫번째 수 (" + firstsu + ")");
            System.out.println("가 두번째 수 (" + secondsu + ") 보다 큰수입니다.");
        }
        else {
            System.out.print("첫번째 수 (" + firstsu + ")");
            System.out.println("가 두번째 수 (" + secondsu + ") 보다 작은수입니다.");

        }
    }
}

package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
public class Ex02If2 {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int firstsu = 0, secondsu = 0, thirdsu = 0;
        int temp = 0; //임시로 사용될 공간

        System.out.print("첫번째 수 =");
        firstsu = Integer.parseInt(in.readLine());
        System.out.print("두번째 수 =");
        secondsu = Integer.parseInt(in.readLine());
        System.out.print("세번째 수 =");
        thirdsu = Integer.parseInt(in.readLine());

        if(secondsu >= firstsu && secondsu >= thirdsu){
            temp = firstsu;
            firstsu = secondsu;
            secondsu = temp;
        }
        else if(thirdsu >= firstsu && thirdsu >= secondsu){
            temp = firstsu;
            firstsu = thirdsu;
            thirdsu = temp;
        }

        else if(thirdsu >= secondsu){
            temp = secondsu;
            secondsu = thirdsu;
            thirdsu = temp;
        }

        System.out.println();
        System.out.println(firstsu + " >= " + secondsu + " >= " + thirdsu);
    }
}

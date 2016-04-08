package Round06;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-06.
 */
//구구단 출력
public class task4 {
    public static void main(String[] ar) throws IOException {
        System.out.println("몇단?");
        int a = 0;
        a = System.in.read()-48;

        for(int i=1;i<=9;i++){
            System.out.println(a+"*"+i+"="+a*i);
        }

    }
}

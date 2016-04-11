package Round09Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-11.
 */
//국영수 점수를 입력 받는 프로그램을 작성해보라.
public class RoundFinish2 {
        int[] sub = new int[4];
        float avg;
        RoundFinish2() throws IOException {
            String[] str = {"국어", "영어", "수학"};
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            for(int a=0;a<str.length;a++){
                System.out.print(str[a]+"=");
                sub[a]=Integer.parseInt(in.readLine());
                sub[str.length] += sub[a];
        }
            avg = sub[str.length] / (float)str.length;
        }
    }


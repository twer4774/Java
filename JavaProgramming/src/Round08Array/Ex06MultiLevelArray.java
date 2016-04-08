package Round08Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-08.
 */
public class Ex06MultiLevelArray {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] subname = {"국어", "영어", "수학"};
        int[][] sub = new int[3][subname.length + 1]; //0 첫번째사람 ~ 2 세번째사람
        float[] avg = new float[3];

        for(int k = 0; k < sub.length; k++){
            for(int i = 0; i < sub[k].length-1; i++){
                do{
                    System.out.print(subname[i] + "=");
                    sub[k][i] = Integer.parseInt(in.readLine());
                }while(sub[k][i] < 0 || sub[k][i] > 100);
                sub[k][sub[k].length -1] += sub[k][i];
            }
            avg[k] = sub[k][sub[k].length-1] / (float)(sub[k].length-1);
        }

        for(int k  = 0; k<sub.length; k++){
            System.out.println();
            System.out.print("총점 = " + sub[k][sub[k].length -1]);
            System.out.println("평균 = " + avg[k]);
        }
    }
}

package Round08Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-08.
 */
//석차까지
public class Ex07MultiLevelArray {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] subname = {"국어", "영어", "수학"};
        int[][] sub = new int[3][subname.length + 2]; //국,영,수,총합,석차
        float[] avg = new float[3];

        for(int k = 0; k < sub.length; k++){
            for(int i = 0; i < sub[k].length-2; i++){
                do{
                    System.out.print(subname[i] + "=");
                    sub[k][i] = Integer.parseInt(in.readLine());
                }while(sub[k][i] < 0 || sub[k][i] > 100);
                sub[k][sub[k].length -2] += sub[k][i];
            }
            avg[k] = sub[k][sub[k].length-2] / (float)(sub[k].length-2);
            sub[k][sub[k].length - 1] =1;
        }
        for(int k=0; k<sub.length;k++){
            for(int i=0; i<sub.length; i++){
                if(sub[k][sub[k].length-2]<sub[i][sub[i].length-2]){
                    sub[k][sub[k].length-1]++;
                }
            }
        }
        for(int k  = 0; k<sub.length; k++){
            System.out.println();
            System.out.println("석차 = " + sub[k][sub[k].length -1]+"등");
            System.out.println("총점 = " + sub[k][sub[k].length -2]);
            System.out.println("평균 = " + avg[k]);
        }
    }

}

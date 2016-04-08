package Round06;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//국영수를 입력받아 총점과 평균 그리고 학점을 구하는 프로그램
public class Ex07DoWhile {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int 국어=0; int 영어=0; int 수학=0; int 총점=0;
        float 평균 = 0;
        char 학점 = 0;

        do {
            System.out.print("국어: ");
            국어 = Integer.parseInt(in.readLine());
        }while(국어<0 || 국어>100);

        do {
            System.out.print("영어: ");
            영어 = Integer.parseInt(in.readLine());
        }while(영어<0 || 영어>100);

        do {
            System.out.print("수학: ");
            수학 = Integer.parseInt(in.readLine());
        }while(수학 <0 || 수학>100);

        총점 = 국어 + 영어 + 수학;
        평균 = 총점/3;
        System.out.println("총점: "+ 총점);
        System.out.println("평균: "+ 평균);

        switch((int)평균/10){
            case 10:case 9: 학점 = 'A'; break;
            case 8: 학점 = 'B'; break;
            case 7: 학점 = 'C'; break;
            case 6: 학점 = 'D'; break;
            default: 학점 = 'F';
        }

        System.out.println("학점 :" + 학점);
    }
}

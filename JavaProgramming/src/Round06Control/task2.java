package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//연도를 입력받아 윤년인지 아닌지를 구별하는 프로그램을 작성해보자
// ( 윤년은 일반적으로 4년에 한번씩 돌아오는데, 그중 100으로 떨어지는해는 윤년이 아니다.
// 그러나 400년으로 떨어지면 윤년이다.)
public class task2 {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("연도를 입력하세요");
        int a = 0;
        a = Integer.parseInt(in.readLine());

        if(a%4==0 && a%100!=0 || a % 400==0){
            System.out.println("윤년입니다.");
        } else{ System.out.println("평년입니다.");}
    }
}

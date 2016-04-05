package Round04InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-03.
 */
//한 사람의 이름을 입력받고 국어 점수와
// 영어 점수 그리고 수학 점수를 입력받아 총점과 평균을 구하는 프로그램을 만들어 보자.
public class task2 {
    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name="";
        int language = 0;
        int english;
        int math;
        float total;

        System.out.print("이름 = ");
        name = in.readLine();
        System.out.print("국어 = ");
        language = Integer.parseInt(in.readLine());
        System.out.print("영어 = ");
        english = Integer.parseInt(in.readLine());
        System.out.print("수학 = ");
        math = Integer.parseInt(in.readLine());

        System.out.println(name+"님! 당신의 성적은 다음과 같습니다.");
        total = language + english + math;
        System.out.println("총점:" + (int)total+"점");
        System.out.println("평균:" + total/3+"점");

    }
}

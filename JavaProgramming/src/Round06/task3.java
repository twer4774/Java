package Round06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
//주민등록번호 8번째 자리를 입력받아 출생지를 알아보는 프로그램을 작성해 보자.
//(임의: 0~9 : 서울, 대구 , 마산, 부산, 대전, 광주, 울산, 목포, 여수, 제주도
public class task3 {
    public static void main(String[] ar) throws IOException {

        System.out.println("주민등록 8번째 자리수 입력:");
        int a = 0;
        a = (int)System.in.read()-48;  //주의!!! -48해야 아스키코드에서 원래 값 추출가능!!

        String region = "";
        switch(a){
            case 0: region="서울"; break;
            case 1: region="대구"; break;
            case 2: region="마산"; break;
            case 3: region="부산"; break;
            case 4: region="대전"; break;
            case 5: region="광주"; break;
            case 6: region="울산"; break;
            case 7: region="목포"; break;
            case 8: region="여수"; break;
            case 9: region="제주도"; break;
        }
        System.out.println("님 출생지는 " + region + "입니다.");
    }
}

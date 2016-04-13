package Round10ClassMember;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-13.
 */
public class Ex11CallByEx10 {
    public static void main(String[] ar) throws IOException {
        System.out.println("좌표 값 처리");
        Ex10DotXY rd = new Ex10DotXY();

        //값 입력 받기
        rd.setX();
        rd.setY();
        //결과 좌표 보기
        rd.display();
        //좌표를 다른 곳으로 옮기기
        System.out.println("좌표를 50, 100으로 이동합니다.");
        rd.setX(50);
        rd.setY(100);
        //다시 한번 결과 좌표 보기
        rd.display();
    }
}

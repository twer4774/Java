package Round13상속과다형성;

import java.util.Objects;

/**
 * Created by TempSW on 2016. 4. 27..
 */

class Inherit extends Object{

}
public class Ex01Inherit extends Object{
    public static void main(String[] arg){
        Inherit in = new Inherit();
        System.out.println("두 객체가 같니? " + in.equals(in));
        System.out.println("in객체의 클래스 이름은? " + in.getClass());
        System.out.println("in객체의 hashCode는? " + in.hashCode());
        System.out.println("in객체를 표현하는 기본 문자열은?" + in.toString());
        System.out.println("in객체를 표현하는 기본문자열 약식은은? "+ in);

    }
}

package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A4{
    int x = 100;
}

class B4 extends A4{
    int y = 200;
}
public class Ex09polymorphism2 {
   /* public static void main(String[] arg){
        A4 ap = new B4(); //다형적 표현
        System.out.println("x = " + ap.x);
        System.out.println("y = " + ap.y); //Compoile Error
    }  ap내에 들어있는 범위는 B4클래스의 인스턴스이지만 ap자체가 A4클래스의 객체인 다형적 표현이기 때문에 접근할 수 있는 필드는 A4클래스의 멤버인 x에 국한됨
        컴파일 에러를 없애려면 A4 ap -> B4 ap로 바꾸면 된다.
    */
}

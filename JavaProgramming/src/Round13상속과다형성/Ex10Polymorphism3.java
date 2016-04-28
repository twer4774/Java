package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A5{
    int x = 100;
}
class B5 extends A5{
    int y = 200;
}
public class Ex10Polymorphism3 {
    public static void main(String[] arg){
        A5 ap = new B5(); //다형적표현
        System.out.println("x = " +ap.x); // x=100
    }
}

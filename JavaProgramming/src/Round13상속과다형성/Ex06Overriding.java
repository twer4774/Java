package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A2{
    public void disp(){
        System.out.println("A2 클래스");
    }
}

class B2 extends A2{
    public void disp(){
        super.disp(); //A2클래스의 disp()메서드 호출 실행시 'A2클래스' 출력
        System.out.println("B2 클래스");
    }
}
public class Ex06Overriding {
    public static void main(String[] arg){
        B2 bp = new B2();
        bp.disp();
    }
}

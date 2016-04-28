package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */

class Inherit2{
    public String toString(){
        return "클래스 Inherit";
    }
}
public class Ex02Inherit2 {
    public static void main(String[] ar){
        Inherit2 in = new Inherit2();
        System.out.println("객체 출력 = " + in);
    }
}

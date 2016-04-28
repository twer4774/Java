package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A6{
    public void aaa(){
        System.out.println("aaa");
    }
    public void bbb() {
        System.out.println("bbb");
    }
}

class B6 extends A6{
    public void bbb(){
        System.out.println("bbb1");
    }
    public void ccc(){
        System.out.println("ccc");
    }
}
public class Ex11PolymorphsimMethod {
    public static void main(String[] arg){
        A6 ap = new B6(); //다형적표현
        ap.aaa(); //A6클래스에서 메서드호출
        ap.bbb(); //B6클래스에서 메서드호출 오버라이딩됨.
        //ap.ccc(); //Compile Error 하위클래스에만 있는 메서드에는 접근 불가능하다.
    }
}

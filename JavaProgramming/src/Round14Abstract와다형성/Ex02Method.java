package Round14Abstract와다형성;

/**
 * Created by TempSW on 2016. 5. 17..
 */
interface A2{
    void aaa();
    public abstract void bbb();
}
class B2 implements A2{
    public void aaa(){ //Compile Error -> public 안붙이면....
        System.out.println("aaa 메서드");

    }
    public void bbb(){
        System.out.println("bbb 메서드");
    }
}
public class Ex02Method {
    public static void main(String[] arg){
        B2 bp = new B2();
        bp.aaa();
        bp.bbb();
    }
}

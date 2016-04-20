package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */
/* Outer클래스의 멤버를 Inner클래스에서 사용가능
class Outer{
    int x = 100;
    class Inner{
        int y = 200;
        public void aaa(){
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
    }
}
public class Ex01Inner {
    public static void main(String[] ar){
        Outer ot = new Outer();
        Outer.Inner oi = ot.new Inner();
        oi.aaa();
    }
} */

//Inner 클래스의 멤버를 Outer 클래스에서 사용하기 위함.
class Outer{
    private int x = 100;
    public void aaa(){
        System.out.println("x=" + x);
        Inner in = new Inner(); //원형은 Outer.Inner in = this.new Inner();
        System.out.println("y=" + in.y);
    }
    class Inner{
        private int y = 200;
    }
}

public class Ex01Inner{
    public static void main(String[] ar){
        Outer ot = new Outer();
        ot.aaa();
    }
}

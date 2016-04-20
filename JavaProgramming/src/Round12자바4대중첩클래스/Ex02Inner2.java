package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */

class Outer1{
    private static int x = 100;
    class Inner1{
        private int x = 200;
        public void aaa(){
            System.out.println("x1=" + Outer1.x);
            System.out.println("y2=" + this.x);
        }
    }
}
public class Ex02Inner2 {
    public static void main(String[] ar){
        Outer1 ot = new Outer1();
        Outer1.Inner1 oi = ot.new Inner1();
        oi.aaa();
    }
}

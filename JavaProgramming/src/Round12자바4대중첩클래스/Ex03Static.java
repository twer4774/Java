package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */

class Outer2{
    private static int x = 100; //static으로 해야 Inner클래스에서 접근가능
    static class Inner2{
        private int y = 200;
        public void aaa(){
            System.out.println("x="+x); //Compile Error 발생
            System.out.println("y="+y);
        }
    }
}
public class Ex03Static {
    public static void  main(String[] ar){
        Outer2.Inner2 oi = new Outer2.Inner2();
        oi.aaa();
    }
}

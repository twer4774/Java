package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */
//mian메서드의 멤버를 사용하려면  멤버는 반드시 final로 선언해야됨
public class Ex06Inner5 {
    public static void main(String[] ar){
        final int x = 100;
        class Inner5{
            int y = 200;
            public void aaa(){
                System.out.println("x=" + x);
                System.out.println("y=" + y);
            }
        }
        Inner5 in = new Inner5();
        in.aaa();
    }
}

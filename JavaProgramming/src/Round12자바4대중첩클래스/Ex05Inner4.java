package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */
//지역중첩클래스
public class Ex05Inner4 {
    public static void main(String[] ar){
        int x = 100;
        class Inner4{
            int y = 200;
        }
        Inner4 in = new Inner4();
        System.out.println(x);
        System.out.println(in.y);
    }
}

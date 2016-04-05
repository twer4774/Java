package Round05Operator;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex05ShortCircuitwithEx04 {
    public static boolean aaa(){
        System.out.println("AAA");
        return true;
    }
    public static boolean bbb(){
        System.out.println("BBB");
        return false;
    }
    public static void main(String[] ar){
        boolean b = aaa() | bbb();
        System.out.println("b = " + b);
    }
}

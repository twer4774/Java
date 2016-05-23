package Round14Abstract와다형성;

/**
 * Created by TempSW on 2016. 5. 17..
 */

interface A1{
    int w = 10;
    static int x = 20;
    final int y = 30;
    public static final int z = 40;
}
public class Ex01Field{
    public static void main(String[] arg){
        //A1 ap = new A1(); //compile Error
        //A1.w = 100; // compile Error

        System.out.println("w = " + A1.w);
        System.out.println("x = " + A1.x);
        System.out.println("y = " + A1.y);
        System.out.println("z = " + A1.z);

    }
}

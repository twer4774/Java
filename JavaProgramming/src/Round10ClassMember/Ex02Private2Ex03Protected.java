package Round10ClassMember;

/**
 * Created by NCL on 2016-04-13.
 */
class Ex02_Other{
    //private int x = 10; //에러발생
    protected int x = 10;
}

public class Ex02Private2Ex03Protected {
    public static void main(String[] ar){
        Ex02_Other rd = new Ex02_Other();
        System.out.println("x=" + rd.x);
    }
}


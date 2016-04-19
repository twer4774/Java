package Round11지정예약어;

/**
 * Created by NCL on 2016-04-19.
 */
public class Ex01This {
    private int x;
    private int y;
    public  Ex01This(){
        x=0;
        y=0;
    }
    public Ex01This(int a, int b){
        x=a;
        y=b;
    }
    public void disp(){
        System.out.println("x=" + x + ", y" + y);
    }
    public static void  main(String[] ar){
        Ex01This rd = new Ex01This(100, 200);
        rd.disp();
    }
}

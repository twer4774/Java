package Round09Class;

/**
 * Created by NCL on 2016-04-11.
 */
public class Ex02MemoryAllocation {
    int a;
    int b;
    float c;

    public static void main(String[] ar){
        Ex02MemoryAllocation kor1 = null;
        kor1 = new Ex02MemoryAllocation();
        kor1.a = 100;
        kor1.b = 200;
        kor1.c = 300.0f;
        System.out.println("a =" + kor1.a);
        System.out.println("b =" + kor1.b);
        System.out.println("c =" + kor1.c);
    }
}

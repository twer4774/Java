package Round03;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex03Initialize2 {
    int x;
    public static void  main(String[] ar){
        Ex03Initialize2 rd = new Ex03Initialize2(); //Garbage Collection Heap으로 인해 자동으로 0 초기화
        System.out.println(rd.x);
    }
}

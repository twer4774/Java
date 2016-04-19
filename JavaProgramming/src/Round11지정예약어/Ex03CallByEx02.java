package Round11지정예약어;

import java.io.IOException;

/**
 * Created by NCL on 2016-04-19.
 */
public class Ex03CallByEx02 {
    public static void main(String[] ar) throws IOException {
        Ex02Static rd = new Ex02Static();
        System.out.println();
        System.out.print("총합은");
        System.out.println(Ex02Static.getTot());
        System.out.println();
        rd.display();
    }
}

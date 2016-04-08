package Round08Array;

/**
 * Created by NCL on 2016-04-07.
 */
public class Ex02Array2 {
    public static void main(String[] ar){
        if(ar.length != 1){
            System.out.println("Usage : java Round02 숫자");
            System.exit(1);
        }
        int x = Integer.parseInt(ar[0]);
        System.out.println("입력된 수 =" +x);
    }
}

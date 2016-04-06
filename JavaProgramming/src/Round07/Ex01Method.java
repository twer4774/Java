package Round07;

/**
 * Created by NCL on 2016-04-06.
 */
public class Ex01Method {
    public static void X(){
        for(int a=0; a<5; a++){
            System.out.print("*");
        }
        return; //결과형 return 값이 void 일 경우 return 문구 생략 가능
    }
    public static void main(String[] ar){
        X();
        System.out.println("\nHello");
        X();
        System.out.println("\nJava");
        X();
        System.out.println("\n");
    }
}

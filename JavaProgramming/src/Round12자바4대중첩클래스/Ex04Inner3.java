package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */
public class Ex04Inner3 {
    public static class Inner3{
        public static void  main(String[] ar){
            System.out.println("Innner 클래스 내부의 main 메서드");
        }
    }
}
//실행시킬려면 java Ex04Inner3$Inner3를 해야 JVM이 main함수를 찾을 수 있음.

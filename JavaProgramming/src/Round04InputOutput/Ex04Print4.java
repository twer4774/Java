package Round04InputOutput;

/**
 * Created by NCL on 2016-04-03.
 */
public class Ex04Print4 {
    public static void  main(String[] ar){
        System.out.printf("%s\n", "조원익");
        System.out.printf("%10s\n\n", "조원익");

        String name = "조원익";
        int age = 25;
        System.out.printf("%10s님의 나이는 %05d세 입니다.\n", name, age);
    }
}

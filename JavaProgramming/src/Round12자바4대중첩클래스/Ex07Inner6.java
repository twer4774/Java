package Round12자바4대중첩클래스;

/**
 * Created by NCL on 2016-04-20.
 */
class Inner6{
    int y = 200;
    public Inner6(){
        this.disp();
    }
    public void disp(){}

    }

public class Ex07Inner6 {
    public static void main(String[] ar){
        final int x = 100;
        new Inner6(){
            public void disp(){
                System.out.println("Default 생성자");
                System.out.println("x=" + x);
                System.out.println("y=" + y);
            }
        };
    }
}


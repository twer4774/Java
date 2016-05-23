package Round14Abstract와다형성;

/**
 * Created by TempSW on 2016. 5. 17..
 */
interface A3{
    int x = 100;
    class B3{
        private int y;
        public B3(){
            this.y = 200;
        }
        public void disp(){
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
public class Ex03정적중첩클래스 {
    public static void main(String[] arg){
        A3.B3 bp = new A3.B3();
        bp.disp();
    }
}

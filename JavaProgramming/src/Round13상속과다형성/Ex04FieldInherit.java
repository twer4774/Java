package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A{
    protected int x = 100;
    protected int y = 200;
}
class B extends A{
    private int r = 300;
    public void disp(){
        System.out.println("x = " + super.x);
        System.out.println("y = " + super.y);
        System.out.println("r = " + this.r);
    }
}
public class Ex04FieldInherit {
    public static void main(String[] arg){
        B bp = new B();
        bp.disp();
    }
}

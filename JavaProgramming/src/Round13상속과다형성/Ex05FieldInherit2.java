package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A1{
    protected int x = 100;
}
class B1 extends A1{
    private int x = 200;
    public void disp(){
        System.out.println("A1 클래스의 x=" + super.x);
        System.out.println("B1 클래스의 x=" + this.x);
    }
}
public class Ex05FieldInherit2 {
    public static void main(String[] arg){
        B1 bp = new B1();
        bp.disp();
    }
}

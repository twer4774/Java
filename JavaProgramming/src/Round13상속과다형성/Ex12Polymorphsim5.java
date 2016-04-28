package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A7{
    private int x = 100;
    private int y = 200;
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void disp(){
        System.out.println("x = " + x + ", y = " + y);
    }
}

class B7 extends A7{
    private int y = 300;
    private int z = 400;
    public void setY(int y){
        this.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }
    public void disp(){
        super.disp();
        System.out.println("y = " + y + ", z = " + z);
    }
}

public class Ex12Polymorphsim5 {
    public static void main(String[] arg){
        A7 ap = new B7();
        ap.disp();
        System.out.println();
        ap.setX(1);
        ap.disp();
        System.out.println();
        ap.setY(2);
        ap.disp();
        //ap.setZ(3);  하위클래스에만 있는 메서드에는 접근불가능하다
        //ap.disp();
    }
}

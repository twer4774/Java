package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
/* class A {
    private int x;
    private int y;

    public A() {
        x = 1;
        y = 1;
    }

    public A(int x) {
        this();
        this.x = x;
    }

    public A(int x, int y) {
        this(x);
        this.y = y;
    }

    public void disp() {
        System.out.print("x = " + x + ", y = " + y);
    }
}

class B extends A {
    private int x;
    private int y;
    public B() {
        super();
        this.x = 1;
        this.y = 1;
    }
    public B(int x) {
        super(x);
        this.x = 1;
        this.y = 1;
    }
    public B(int x, int y) {
        super(x, y);
        this.x = 1;
        this.y = 1;
    }
    public B(int x, int y, int x1) {
        super(x, y);
        this.x = x1;
        this.y = 1;
    }
    public B(int x, int y, int x1, int y1) {
        super(x, y);
        this.x = x1;
        this.y = y1;
    }
    public void disp() {
        super.disp();
        System.out.println(", x = " + x + ", y = " + y);
    }
}
public class task1 {
    public static void main(String[] ar) {
        B bp = new B();
        B bp1 = new B(10);
        B bp2 = new B(10, 20);
        B bp3 = new B(10, 20, 30);
        B bp4 = new B(10, 20, 30, 40);
        bp.disp();
        bp1.disp();
        bp2.disp();
        bp3.disp();
        bp4.disp();
    }
}

*/
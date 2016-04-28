package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class UpperClass {
    int x;
    int y;

    public UpperClass() {
        x = 10;
        y = 20;
    }

    public UpperClass(int x) {
        this(); //자신의 클래스 public UpperClass() 생성자 호출
        this.x = x;
    }

    public UpperClass(int x, int y) {
        this(x); //자산의 클래스 public UpperClass(int x) 생성자 호출
        this.y = y;
    }
}

class LowerClass extends UpperClass{
    int r;
    public LowerClass(){
        super(); //상위 클래스의 public UpperClass() 생성자 호출. 생략가능.
        r = 30;
    }
    public LowerClass(int x){
        super(x); //상위 클래스의 public UpperClass(int x) 생성자 호출
        r = 30;
    }
    public LowerClass(int x, int y){
        super(x, y); //상위 클래스의 public UpperClass(int x, int y) 생성자 호출
        r = 30;
    }
    public LowerClass(int x, int y, int r){
        this(x,y); //자신의 클래스 public LowerClass(int x, int y) 생성자 호출
        this.r = r;
    }
}
public class Ex03UpperClass {
    public static void main(String[] arg){
        //필요한 객체 생성 가능.
    }
}

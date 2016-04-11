package Round09Class;

/**
 * Created by NCL on 2016-04-11.
 */
public class Ex03Construct {
    /*Ex03Construct(){ //생성자
        // 멤버필드들의 초기값을 할당하는 역할
        생성자 메서드의 특징
        * 1. 클래스명과 동일하다
        * 2. 결과형 리턴값을 가지지 않는다 (void도 적지않음)
        * 3. 클래스 객체가 생성될 때 반드시 하나의 생성자가 호출된다.
        * 4. 멤버 필드들의 값을 초기화한다.
        * 5. 하나의 클래스 내부에 생성자가 하나도 없으면 자동적으로 default 생성자가 있는 것으로 인식한다.
        * 6. 하나의 클래스에는 매개변수의 개수가 다르거나 매개변수의  자료형이 틀린 생성자들이 여러개 있을 수 있다.(생성자 오버로딩)
        * 7. 생성자의 첫 번재 라인으로 this(매개변수)생성자를 사용하여 또 다른 생성자 하나를 호출할 수 있다.
    }*/

    int a;
    double b;

    Ex03Construct(){
        a=100;
        b=200.0;
    }
    Ex03Construct(int x){
        a=x;
        b=200;
    }
    Ex03Construct(double x){
        a=100;
        b=x;
    }
    Ex03Construct(int x, double y){
        a=x;
        b=y;
    }

    public static void main(String[] ar){
        Ex03Construct kor = new Ex03Construct();
        Ex03Construct kor1 = new Ex03Construct(55);
        Ex03Construct kor2 = new Ex03Construct(78.923);
        Ex03Construct kor3 = new Ex03Construct(123, 45.678);
        System.out.println(kor.a + "," + kor.b);
        System.out.println(kor1.a + "," + kor1.b);
        System.out.println(kor2.a + "," + kor2.b);
        System.out.println(kor3.a + "," + kor3.b);

    }

}

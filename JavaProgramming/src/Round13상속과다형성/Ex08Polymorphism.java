package Round13상속과다형성;

/**
 * Created by TempSW on 2016. 4. 27..
 */
class A3{
    public String toString(){
        return "A3 Class";
    }
}

class B3{
    public String toString(){
        return "B3 Class";
    }
}

public class Ex08Polymorphism {
    public static void main(String[] arg){
//        A3 ap = new A3();
//        B3 bp = new B3();
//        System.out.println("ap = " + ap); //ap.toString()의 약식 표현
//        System.out.println("bp = " + bp); //bp.toString()의 약식 표현

        Object[] obj = new Object[2];
        obj[0] = new A3();
        obj[1] = new B3();
        for(int a=0; a<obj.length; a++){
            System.out.println("ojb[" + a + "] = " + obj[a]); //obj[a].toString()의 약식표현
        }
    }
}

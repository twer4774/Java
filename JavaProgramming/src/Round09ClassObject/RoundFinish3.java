package Round09ClassObject;

/**
 * Created by NCL on 2016-04-11.
 */
//친구들의 정보를 관리하는 프로그램을 만들고자 한다.
// 이름과 주민번호, 전화번호와 주소를 기억할 수 이도록 Person이라는 클래스를 만들고 초기값으로 이름은 'guest',
// 주민등록번호는 '000000-0000000', 전화번호는 '000-0000-0000',
// 주소는 '주소 기재하지 않음' 이라는 값을 가질 수 있도록 하고
// 오버로딩된 생성자로 이름만 입력받아 대입하는 것과 이름과 주민번호를 입력받아 대입하는 것,
// 이름과 주민등록번호와 전화번호를 입력받아 대입하는 것
// 그리고 전부 입력받아 대입하는 것을 만들어 보라.
public class RoundFinish3 {
        String name;
        String jumin;
        String tel;
        String addr;

        RoundFinish3(){
            name = "guest";
            jumin = "000000-0000000";
            tel = "000-0000-0000";
            addr = "주소 기재하지 않음";
        }

        /*RoundFinish3(String a){
            this();
            name = a;
        }
        RoundFinish3(String a String b){
            this(a);
            jumin = b;
        }
        RoundFinish3(String a, String b, String c){
            this(a,b);
            tel = c;
        }
        RoundFinish3(String a, String b, String c, String d){
            this(a,b,c);
            addr=d;
        }*/
}

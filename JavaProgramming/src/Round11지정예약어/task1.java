package Round11지정예약어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by NCL on 2016-04-19.
 */
public class task1 {
    private String name;
    private Double money;
    private String date;
    private static String password;
    private static float iyul;
    private static BufferedReader in;
    private static SimpleDateFormat format;

    static {
        iyul = 5;
        in = new BufferedReader(new InputStreamReader(System.in));
        format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
        password = "1111";
    }

    private task1 next; //자기 참조

    public task1() {
        this.name = name;
        this.money = money;
        this.iyul = iyul;
        this.password = password;
    }

    public void newMember() throws IOException {
        System.out.println("==신규 가입==");
        System.out.print("이름 =");
        name = in.readLine();
        System.out.print("입금 금액 = ");
        money = Double.parseDouble(in.readLine());

        date = format.format(new Date());
        System.out.println();
        System.out.println("신규 가입이 " + date + "에 처리 되었습니다.");
        System.out.println("입금한 금액은 " + money + "원 입니다.");
        System.out.println("현재 적용 이율은 " + task1.iyul + "%입니다.");
        System.out.println("==신규 가입 끝==");

        money += money * task1.iyul / 100;
        this.setNext();
    }

    public static void change_iyul() throws IOException {
        System.out.print("관지라 패스워드를 입력하세요");
        String pw = in.readLine();
        if (!pw.equals(password)) {
            System.out.println("패스워드가 올바르지 않습니다.");
            return;
        }
        System.out.println("현재 " + task1.iyul + "%의 이율이 적용되고 있습니다. 얼마로 변경하시겠습니까?");
        System.out.print("적용 이율 = ");
        task1.iyul = Float.parseFloat(in.readLine());
        System.out.println("모든 고객에게 " + task1.iyul + "%로 변경 적용됩니다.");
    }

    public void customerInfo() {
        System.out.println("==현재 등록 고객 정보==");
        System.out.println("이름\t금액\t이율");
        System.out.println("==========================");
        task1 custom = this;
        while (custom.next != null) {
            System.out.print(custom.name +"\t");
            System.out.print(custom.money + "\t");
            System.out.println(task1.iyul);
            custom = custom.next;
        }
        System.out.println("===========================");
    }

    public static void end() {
        System.out.println("은행 영업을 마감합니다. 수고하셨습니다.");
        System.exit(0);
    }

    public task1 getNext() {
        return next;
    }

    private void setNext() {
        next = new task1();
    }

}

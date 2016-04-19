package Round11지정예약어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1_run{

    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        task1 bank = new task1();
        while(true){
            System.out.print("1.신규가입 2.이율변경 3.등록인원정보 4.종료 ==>");
            int pos = Integer.parseInt(in.readLine());
            if(pos == 1){
                task1 jb = bank;
                if(jb.getNext() != null){
                    jb = jb.getNext();
                }
                jb.newMember();
            }
            else if(pos == 2){
                task1.change_iyul();
            }
            else if(pos == 3){
                bank.customerInfo();
            }
            else if(pos==4){
                task1.end();
            }
            else {
                System.out.println("잘못 입력 하셨습니다.");
            }
            System.out.println();
        }
    }
}

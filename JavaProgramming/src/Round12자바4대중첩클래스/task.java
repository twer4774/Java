package Round12자바4대중첩클래스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * Created by NCL on 2016-04-20.
 */
//주민등록번호 검증기와 성적 관리가 동시에 실행될 수 있는 클래스를 중첩클래스를 이용하여 작성
//주민등록번호를 검사하고 올바르다면 성적을 입력받아 처리하고 결과를 출력하는 프로그램
class Util {
    private String name;
    private static BufferedReader in;
    static {
        in = new BufferedReader(new InputStreamReader(System.in));
    }
    public Util() throws IOException {
        System.out.print("이름 = ");
        name = in.readLine();
    }

    public void disp() {
        System.out.println(name + "님의 정보들!");
    }

    public class Jumin_Check {
        private int[] jumin = new int[14];
        private String sex;
        private String birth;
        private int age;
        private String area;

        public Jumin_Check() throws IOException {
            boolean check = false;
            do {
                check = false;
                System.out.print("주민번호 = ");

                for(int i = 0; i < jumin.length; ++i) {
                    jumin[i] = System.in.read() - 48;
                }
                in.readLine(); // 엔터키 처리

                int hap = 0;
                float temp = 0;
                float temp1 = 0;
                int cre = 2;
                for(int i = 0; i < jumin.length - 1; ++i) {
                    if(i == 6) continue;
                    hap += jumin[i] * cre++;
                    if(cre == 10) cre = 2;
                }
                temp = (int)(hap / 11.0f) * 11.0f + 11.0f - hap;
                temp1 = temp - (int)(temp / 10.0f) * 10.0f;
                if(temp1 != jumin[13]) check = true;
                sex = jumin[7] % 2 == 0 ? "여성" : "남성";
                int year = 0;
                switch(jumin[7]) {
                    case 9: case 0: year = 1800; break;
                    case 1: case 2: year = 1900; break;
                    case 3: case 4: year = 2000; break;
                    default: year = -1;
                }
                if(year != -1) {
                    year += jumin[0] * 10 + jumin[1];
                }
                int month = jumin[2] * 10 + jumin[3];
                if(month < 0 || month > 12) check = true;
                int day =jumin[4] * 10 + jumin[5];
                if(day < 0 || day > 31) check = true;
                if(year == -1) birth = "외국인 ";
                else birth = year + "년 ";
                birth += month + "월 " + day + "일";
                Calendar ca = Calendar.getInstance();
                age = ca.get(Calendar.YEAR) - year + 1;
                switch(jumin[8]) {
                    case 0: area = "서울"; break;
                    case 1: area = "경기, 인천"; break;
                    case 2: area = "부산, 강원"; break;
                    case 3: area = "강원, 충청"; break;
                    case 4: area = "충청, 전라"; break;
                    case 5: area = "전라, 대전"; break;
                    case 6: area = "경상, 대구"; break;
                    case 7: area = "경상도"; break;
                    case 8: area = "경상도"; break;
                    case 9: area = "제주도"; break;
                }

                if(check) {
                    System.out.println("\n주민번호가 올바르지 않습니다. 다시 입력하세요!\n");
                }
            } while(check);

        }

        public void disp() {
            System.out.println();
            System.out.println("성별 : " + sex);
            System.out.println("생년월일 : " + birth);
            System.out.println("나이 : " + age + "세");
            System.out.println("출생지 : " + area);
            System.out.println();
        }
    }
    public class Sungjuk_Process {
        private String[] sub = new String[] {"국어", "영어", "수학"};
        private int[] subject = new int[sub.length + 2];
        private float avg;
        private char hak;

        public Sungjuk_Process() throws IOException {
            for(int i = 0; i < sub.length; ++i) {
                System.out.print(sub[i] + " = ");
                subject[i] = Integer.parseInt(in.readLine());
                subject[sub.length] += subject[i];
            }
            subject[sub.length + 1] = 1; // 등수 1등으로 무조건 설정
            avg = subject[sub.length] / (float)sub.length;
            switch((int)(avg / 10)) {
                case 10:
                case 9: hak = 'A'; break;
                case 8: hak = 'B'; break;
                case 7: hak = 'C'; break;
                case 6: hak = 'D'; break;
                default: hak = 'F'; break;
            }
        }
        public void disp() {
            System.out.println();
            System.out.println("총점 : " + subject[sub.length] + "점");
            System.out.printf("평균 : %.2f점\n", avg);
            System.out.println("학점 : " + hak + "학점");
            System.out.println("석차 : " + subject[sub.length + 1] + "등");
        }
    }
}
public class task {
    public static void main(String[] ar) throws IOException {
        Util ut = new Util();
        System.out.println();
        Util.Jumin_Check uj = ut.new Jumin_Check();
        System.out.println();
        Util.Sungjuk_Process us = ut.new Sungjuk_Process();
        System.out.println();
        ut.disp();
        uj.disp();
        us.disp();
    }
}

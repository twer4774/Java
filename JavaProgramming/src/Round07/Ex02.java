package Round07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-06.
 */
public class Ex02 {
    //둘 중 큰 수를 구하는 코드
    public static int aaa() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫번째수");
        int a = Integer.parseInt(in.readLine());
        System.out.println("두번째수");
        int b = Integer.parseInt(in.readLine());
        if (a < b) {
            return a;
        }
        return b;
    }

    //두 수 사이에 있는 값들의 합
    public static int bbb() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("첫번째수");
        int a = Integer.parseInt(in.readLine());
        System.out.println("두번째수");
        int b = Integer.parseInt(in.readLine());

        int sum = 0; //초기화
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else if (a > b) {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    //세개의 숫자를 입력 받아 큰 순서대로 나열하도록 하는 프로그램
    public static String ccc(int x, int y, int z){
        if(y>=x && y>=z){
            int temp = x;
            x=y;
            y=temp;
        }
        else if(z>=x && z>=y){
            int temp = x;
            x=z;
            z=temp;
        }
        if(z>=y){
            int temp=y;
            y=z;
            z=temp;
        }
        String abc = x + ">=" + y + ">=" + z;
        return abc;
    }

    public static void main(String[] ar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        while(true){
            System.out.print("1:최대수 2:사이합 3:수나열 4:종료");
            x = Integer.parseInt(in.readLine());
            if(x == 1){
                int k = aaa();
                System.out.println("둘 중 최대수는" + k + "입니다.");
            }
            else if(x==2){
                bbb();
            }
            else if(x==3){
                System.out.print("첫번째 수 =");
                int firstsu = Integer.parseInt(in.readLine());
                System.out.print("두번째 수 =");
                int secondsu = Integer.parseInt(in.readLine());
                System.out.print("세번째 수 =");
                int thirdsu = Integer.parseInt(in.readLine());
                //String str = ccc(firstsu, secondsu, thirdsu);
                System.out.println("큰 순으로 나열은 " + ccc(firstsu,secondsu,thirdsu));
            }
            else if(x==4){
                break;
            }
            else{
                System.out.println("잘못입력하셨습니다.");
            }
        }
        System.out.println("종료합니다");
    }
}

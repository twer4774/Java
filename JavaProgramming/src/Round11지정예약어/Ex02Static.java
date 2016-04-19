package Round11지정예약어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-19.
 */
public class Ex02Static {
    private int x;
    private int y;
    private static int tot;
    private static BufferedReader in;
    static {
        Ex02Static.in = new BufferedReader(new InputStreamReader(System.in));
        Ex02Static.tot = 0;
    }
    public Ex02Static() throws IOException {
        System.out.print("x=");
        this.x = Integer.parseInt(Ex02Static.in.readLine());
        System.out.print("y=");
        this.y = Integer.parseInt(Ex02Static.in.readLine());
        Ex02Static.tot = this.x + this.y;
    }
    public static int getTot(){
        return Ex02Static.tot;
    }
    public static void setTot(int tot){
        Ex02Static.tot = tot;
    }
    public void display(){
        System.out.print(this.x + "+" + this.y + " = ");
        System.out.println(Ex02Static.tot);
    }
}

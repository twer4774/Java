package Round10ClassMember;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by NCL on 2016-04-13.
 */
public class Ex10DotXY {
    private int x;
    private int y;
    private BufferedReader in;

    public Ex10DotXY(){
        this.in = new BufferedReader(new InputStreamReader(System.in));
        this.x = 0;
        this.y = 0;
    }

    public void setX() throws IOException {
        System.out.print("x=");
        this.x = Integer.parseInt(in.readLine());
    }
    public void setY() throws IOException {
        System.out.print("y=");
        this.y = Integer.parseInt(in.readLine());
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.println();
        System.out.print("점의 좌표(x,y)=");
        System.out.println("("+x+","+y+")");
        System.out.println();
    }
}

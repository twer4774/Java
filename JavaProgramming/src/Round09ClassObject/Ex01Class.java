package Round09ClassObject;

/**
 * Created by NCL on 2016-04-11.
 */
public class Ex01Class {
    private int[] sub;  //Field 변수
    private float avg;

    public Ex01Class() { //Construct 생성장
        sub = new int[4];
        avg = 0.0f;
    }

    public void calc(){ //Method 메서드
        int tot = 0;
        for(int a= 0; a<sub.length; a++){
            tot += sub[a];
        }
        avg = tot / sub.length;
    }

    public static class Ex01_Inner{ //Nested Class 중첩클래스
        private String[] subname = {"국어", "영어", "수학"}; //Field
        public String getSubname(int x){ //메서드
            return subname[x];
        }
    }

}

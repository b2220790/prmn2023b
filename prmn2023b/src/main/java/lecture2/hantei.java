package lecture2;

public class hantei {
    void check (String i1,String i2,String i3,String i4,String i5,String p1,String p2,String p3,String p4,String p5,String I,String P){
        if(i1.equals(I) && p1.equals(P)){
            System.out.println("ログイン完了");
        } else if (i2.equals(I) && p2.equals(P)) {
            System.out.println("ログイン完了");
        } else if (i3.equals(I) && p3.equals(P)) {
            System.out.println("ログイン完了");
        } else if (i4.equals(I) && p4.equals(P)) {
            System.out.println("ログイン完了");
        } else if (i5.equals(I) && p5.equals(P)) {
            System.out.println("ログイン完了");
        }
        else{
            System.out.println("不正なアクセス");
        }

    }
}

package lecture2;
import java.util.Scanner;
public class proc23 {
    public static void main(String[] args) {
        String id1 ="B1";
        String pass1 ="abc";
        String id2 ="B2";
        String pass2 = "123";
        String id3 ="B3";
        String id4 ="B4";
        String id5 ="B5";
        String pass3 = "aiu";
        String pass4 = "kon";
        String pass5 = "wasd";

        System.out.print("学籍番号を入力:");
        Scanner input = new Scanner(System.in);
        String id = input.next();
        System.out.print("パスワードを入力:");
        String pass = input.next();
        hantei h = new hantei();
        h.check(id1,id2,id3,id4,id5,pass1,pass2,pass3,pass4,pass5,id,pass);





    }
}

package lecture2;

import java.util.Scanner;
public class prac32 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("名前を入力してください:");
        String name1 = scan.next();
        System.out.print("学籍番号を入力してください:");
        int num1 = scan.nextInt();

        System.out.print("氏名:"+name1);
        System.out.print("学籍番号:"+num1);

    }
}

package lecture2;
import java.util.Scanner;
public class prac22 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.print("数字を入力:");
            a[i] = scan.nextInt();
        }
        keisan ken = new keisan();
        ken.tasizan(a);


    }
}

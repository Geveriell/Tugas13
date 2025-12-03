//percobaan 2
 
import java.util.Scanner;

public class Percobaan2 {

    // Fungsi rekursif
    static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return bilangan * hitungPangkat(bilangan, pangkat - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}

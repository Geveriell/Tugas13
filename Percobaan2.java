import java.util.Scanner;

public class Percobaan2 {

    // Fungsi rekursif
    static int hitungPangkat(int bilangan, int pangkat) {
        if (pangkat == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(bilangan + "x");
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
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}

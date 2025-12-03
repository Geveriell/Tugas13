import java.util.Scanner;

public class Percobaan3 {

    //Fungsi rekursif
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return saldo; // base case
        } else {
            return hitungLaba(saldo * 1.11, tahun - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Masukkan saldo awal: ");
        saldoAwal = sc.nextDouble();

        System.out.print("Masukkan lama investasi (tahun): ");
        tahun = sc.nextInt();

        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}

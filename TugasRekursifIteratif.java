import java.util.Scanner;

public class TugasRekursifIteratif {

    //fungsi rekursif
    static int totalRekursif(int[] data, int index) {
        if (index == 0) {
            return data[0]; // base case
        } else {
            return data[index] + totalRekursif(data, index - 1); // recursive call
        }
    }

    //fungsi iteratif
    static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        int[] angka = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }
        //rekursif
        int totalR = totalRekursif(angka, n - 1);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalR);
    }
}

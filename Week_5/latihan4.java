import java.util.ArrayList;
import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        ArrayList<Integer> jumlah = new ArrayList<>();
        ArrayList<Integer> pengurangan = new ArrayList<>();
        ArrayList<Integer> perkalian = new ArrayList<>();
        ArrayList<Double> pembagian = new ArrayList<>();
        
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        
        System.out.println("Masukkan nilai untuk Nilai 1:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai1.add(scanner.nextInt());
        }
        
        System.out.println("Masukkan nilai untuk Nilai 2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Index ke " + i + " = ");
            nilai2.add(scanner.nextInt());
        }
        
        System.out.println("Hasil operasi antara Nilai 1 dan Nilai 2:");
        for (int i = 0; i < jumlahData; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            pengurangan.add(nilai1.get(i) - nilai2.get(i));
            perkalian.add(nilai1.get(i) * nilai2.get(i));
            pembagian.add(nilai2.get(i) != 0 ? (double) nilai1.get(i) / nilai2.get(i) : Double.NaN);
        }
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Index ke " + i + ":");
            System.out.println("Penjumlahan = " + jumlah.get(i));
            System.out.println("Pengurangan = " + pengurangan.get(i));
            System.out.println("Perkalian = " + perkalian.get(i));
            System.out.println("Pembagian = " + pembagian.get(i));
        }
        
        scanner.close();
    }
}

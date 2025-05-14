package BangunDatar;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan panjang sisi: ");
            int sisi = input.nextInt();
            BangunDatar persegi = new BangunDatar(sisi);
            persegi.luas(persegi);
            System.out.print("Luas persegi: ");
            persegi.getLuas();
            break;

            case 2:
            System.out.print("Masukkan panjang: ");
            int panjang = input.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = input.nextInt();
            BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
            persegiPanjang.luas(persegiPanjang);
            System.out.print("Luas persegi panjang: ");
            persegiPanjang.getLuas();
            break;

            case 3:
            System.out.print("Masukkan alas: ");
            double alas = input.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = input.nextDouble();
            BangunDatar segitiga = new BangunDatar(0);
            segitiga.stat = "triangle";
            segitiga.alas = alas;
            segitiga.tinggi = tinggi;
            segitiga.luas(segitiga);
            System.out.print("Luas segitiga: ");
            segitiga.getLuas2();
            break;

            case 4:
            System.out.print("Masukkan jari-jari: ");
            double radius = input.nextDouble();
            BangunDatar lingkaran = new BangunDatar(radius, "circle");
            lingkaran.luas(lingkaran);
            System.out.print("Luas lingkaran: ");
            lingkaran.getLuas2();
            break;

            case 5:
            break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }
}  

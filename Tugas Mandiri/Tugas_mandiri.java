
public class Tugas_mandiri {

    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("Hallo, Nama saya Yonatan Kristian");
        System.out.println("Saya adalah mahasiswa Teknik Informatika Universitas Dian Nuswantoro");
        System.out.println("Saya sedang menulis program Java");
    

        // Keliling lingkaran 
        int diameter_lingkaran = 10;
        float keliling_lingkaran = (float) (3.14 * diameter_lingkaran);
        System.out.println("================================");
        System.out.println("C. Keliling Lingkaran"); 
        System.out.println("================================");
        System.out.println("Diameter lingkaran adalah : " + diameter_lingkaran);
        System.out.println("Keliling lingkaran adalah : " + keliling_lingkaran);

        //Luas segitiga siku-siku
        int alas = 6;
        int tinggi = 8;
        float luas_segitiga = (float) (0.5 * alas * tinggi);
        System.out.println("================================");
        System.out.println("B.  Luas Segitiga");
        System.out.println("================================");
        System.out.println("Alas segitiga siku-siku adalah : " + alas);
        System.out.println("Tinggi segitiga siku-siku adalah : " + tinggi);
        System.out.println("Luas segitiga siku-siku adalah : " + luas_segitiga);

         //Volume tabung 
         double diameter = 5;
         double tinggi_tabung= 10;
         double jari_jari = diameter / 2;
         double volume = 3.14 * (jari_jari * jari_jari) * tinggi_tabung;
         System.out.println("================================");
         System.out.println("C. Volume Tabung"); 
         System.out.println("================================");
         System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah " + volume );
         


    }
}
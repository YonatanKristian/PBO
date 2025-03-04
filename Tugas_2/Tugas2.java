import java.util.jar.JarInputStream;

public class Tugas2{
    public static void main(String[] s) {

        // persegi 
        int sisi = 5;
        int luaspersegi = sisi*sisi;
        int kelilingpersegi = 4*sisi;
        System.out.println("================");
        System.out.println("1. Persegi ");
        System.out.println("================");
        System.out.println("sisi : " + sisi);
        System.out.println("Luas : " + luaspersegi);
        System.out.println("Keliling : " + kelilingpersegi);
      
        //segitiga
        int alas=5;
        int tinggi=10;
        float luassegitiga = (alas*tinggi)/2;
        float kelilingsegitiga = (float) Math.sqrt(alas*alas+tinggi);

        System.out.println("================");
        System.out.println("2. Segitiga");
        System.out.println("================");
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Luas : " + luassegitiga);
        System.out.println("Keliling : " + kelilingsegitiga);

        //lingkaran

        int jarijari = 5;
        float phi=3.14f;
        float luaslingkaran = phi*jarijari*jarijari;
        float kelilinglingkaran = 2*phi*jarijari;

        System.out.println("================");
        System.out.println("3. Lingkaran");
        System.out.println("================");
        System.out.println("Jari-jari : " + jarijari);
        System.out.println("Luas : " + luaslingkaran);
        System.out.println("Keliling : " + kelilinglingkaran);


        //kubus 
        int sisiKubus = 5;
        int luaskubus = sisiKubus*sisiKubus*sisiKubus;
        int kelilingkubus = 12*sisiKubus;
        System.out.println("================");
        System.out.println("4. Kubus");
        System.out.println("================");
        System.out.println("Sisi : " + sisiKubus);
        System.out.println("Luas : " + luaskubus);
        System.out.println("Keliling : " + kelilingkubus);
             
    }
}
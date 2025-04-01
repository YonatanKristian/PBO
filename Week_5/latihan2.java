import java.util.Scanner;

class Nilai {
    private String nama;
    private int nilai;
    
    public Nilai(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public String getGrade() {
        if (nilai > 85) {
            return "A";
        } else if (nilai > 70) {
            return "B";
        } else {
            return "C";
        }
    }
    
    public void tampilkan() {
        System.out.println("Nama: " + nama + ", Nilai: " + nilai + ", Grade: " + getGrade());
    }
}

public class latihan2 {
    private Nilai[] daftarNilai;
    private int jumlah;
    
    public latihan2(int kapasitas) {
        daftarNilai = new Nilai[kapasitas];
        jumlah = 0;
    }
    
    public void tambahNilai(String nama, int nilai) {
        if (jumlah < daftarNilai.length) {
            daftarNilai[jumlah] = new Nilai(nama, nilai);
            jumlah++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    
    public void daftarNilai() {
        System.out.println("Daftar Nilai:");
        for (int i = 0; i < jumlah; i++) {
            daftarNilai[i].tampilkan();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();
        
        latihan2 dataNilai = new latihan2(jumlahData);
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan nilai: ");
            int nilai = scanner.nextInt();
            scanner.nextLine();
            dataNilai.tambahNilai(nama, nilai);
        }
        
        dataNilai.daftarNilai();
        scanner.close();
    }
}

import java.util.Scanner;

class SingleArray {
    protected int[] data;
    
    public SingleArray(int size, int defaultValue) {
        data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = defaultValue;
        }
    }
    
    public void printData() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("data ke -" + (i + 1) + " : " + data[i]);
        }
    }
}

public class latihan1 extends SingleArray {
    public latihan1() {
        super(5, 68);
    }
    
    public void modifyAndPrint() {
        int[] newValues = {68, 7, 28, 90, 32};
        System.out.println("hasil nilai {0} = " + newValues[0]);
        System.out.println("hasil nilai {1} = " + newValues[1]);
        System.out.println("hasil nilai {2} = " + newValues[2]);
        System.out.println("hasil nilai {3} = " + newValues[3]);
        System.out.println("hasil nilai {4} = " + newValues[4]);
    }
    
    public static void main(String[] args) {
        latihan1 array1 = new latihan1();
        System.out.println("jumlah data : " + array1.data.length);
        array1.printData();
        array1.modifyAndPrint();
    }
}
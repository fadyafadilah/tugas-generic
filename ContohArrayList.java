package PBOSESI7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Muhamad");
        nama.add("Fadya");
        nama.add("Fadilah");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Fadilah");

        boolean adaFadya = nama.contains("Fadya");

        System.out.println("Apakah ada Fadya? " + adaFadya);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}

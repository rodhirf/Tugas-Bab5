public class Perhitungan {

    int m, n, r, gcd, atas, bawah;

public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Hasil Penjumlahannya adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Hasil Pengurangannya Adalah : " + nilai);
    }

    public void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil Perkaliannya Adalah = " + nilai);
    }

    public void hitungPembagian(int a, int b) {
        double nilai = a / b;
        System.out.println("Hasil Pembagiannya Adalah = " + nilai);
    }

public void Sederhana(int a, int b) {
        m = (a > b) ? a : b;
        n = (a > b) ? b : a;
        do {
            r = m % n;
            if (r == 0) {
                gcd = n;
            } else {
                m = n;
                n = r;
            }
        } while (r != 0);
        atas = a / gcd;
        bawah = b / gcd;
        System.out.println("Hasil = " + atas + "/" + bawah);
    }

}



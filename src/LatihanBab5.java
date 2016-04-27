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

class mainPerhitungan {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("Program Perhitungan");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Sederhanakan");
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = inp.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Penjumlahan");
                    System.out.print("Masukkan Angka : ");
                    int angka1 = inp.nextInt();
                    System.out.print("Masukkan Angka : ");
                    int angka2 = inp.nextInt();
                    Perhitungan.hitungPenjumlahan(angka1, angka2);
                    break;

                case 2:
                    System.out.println("Pengurangan");
                    System.out.print("Masukkan Angka : ");
                    angka1 = inp.nextInt();
                    System.out.print("Masukkan Angka : ");
                    angka2 = inp.nextInt();
                    Perhitungan.hitungPengurangan(angka1, angka2);
                    break;

                case 3:
                    Perhitungan kali = new Perhitungan();
                    System.out.println("Perkalian");
                    System.out.print("Masukkan Angka : ");
                    angka1 = inp.nextInt();
                    System.out.print("Masukkan Angka : ");
                    angka2 = inp.nextInt();
                    kali.hitungPerkalian(angka1, angka2);
                    break;

                case 4:
                    Perhitungan bagi = new Perhitungan();
                    System.out.println("Pembagian");
                    System.out.print("Masukkan Angka : ");
                    angka1 = inp.nextInt();
                    System.out.print("Masukkan Angka : ");
                    angka2 = inp.nextInt();
                    bagi.hitungPembagian(angka1, angka2);
                    break;

                case 5:
                    Perhitungan sederhana = new Perhitungan();
                    System.out.print("Masukkan pembilang : ");
                    int a = inp.nextInt();
                    System.out.print("Masukkan penyebut : ");
                    int b = inp.nextInt();
                    sederhana.Sederhana(a, b);
                    break;

                default:
                    System.out.println("Pilihan tidak ditemukan");

            }
        } while (pilih != 0);
    }

}




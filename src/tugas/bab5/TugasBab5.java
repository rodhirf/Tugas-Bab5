public class Labkomdas {
final int a = 100000;
final int b = 125000;
final int c = 175000;
int total;

public  void hargaA(int x) {
if (x > 100) {
total = 95000 * x;
System.out.println("Jadi total harga yang wajib dibayar : " + total);
} else {
total = this.a * x;
System.out.println("Jadi total harga yang wajib dibayar : " + total);
}
}

public void hargaB(int x) {
if (x > 100) {
total = 120000 * x;
System.out.println("Jadi total harga yang wajib dibayar : " + total);
} else {
total = this.b * x;
System.out.println("Jadi total harga yang wajib dibayar : " + total);
}
}

public void hargaC(int x) {
if (x > 100) {
total = (160000 * x);
System.out.println("Jadi total harga yang wajib dibayar : " + total);
} else {
total = this.c * x;
System.out.println("Jadi total harga yang wajib dibayar : " + total);
}
}
}

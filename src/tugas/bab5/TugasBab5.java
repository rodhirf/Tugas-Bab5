import java.util.Scanner;
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

class MainLabkomdas {
public static void main(String args[]) {
int x,pilihan;
Labkomdas lk = new Labkomdas();
Scanner input = new Scanner(System.in);
System.out.println("CV. Labkomdas");
System.out.println("=============");
System.out.println("Anda ingin membeli jaket? A(1)/B(2)/C(3)");
System.out.print("pilihan : ");
pilihan = input.nextInt();
if (pilihan == 1){
System.out.print("Anda ingin membeli jaket sebanyak? ");
x = input.nextInt();
lk.hargaA(x);
}
else if (pilihan == 2){
System.out.print("Anda ingin membeli jaket sebanyak? ");
x = input.nextInt();
lk.hargaB(x);
}
else if (pilihan == 3){
System.out.print("Anda ingin membeli jaket sebanyak? ");
x = input.nextInt();
lk.hargaC(x);
}
else{
System.out.print("Jaket yang mau anda beli tidak diproduksi!");
}
}
}


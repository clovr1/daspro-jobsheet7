import java.util.Scanner;

public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;

        String namaPelanggan;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;

        kopi = 2;
        teh = 1;
        roti = 3;
        namaPelanggan = "";
        
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jumlah kopi: " + kopi + " x Rp" + hargaKopi);
        System.out.println("Jumlah teh: " + teh + " x Rp" + hargaTeh);
        System.out.println("Jumlah roti: " + roti + " x Rp" + hargaRoti);

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
                
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
            

        }while (true);
        System.out.println("Semua transaksi selesai");
        sc.close();
        
    }
}

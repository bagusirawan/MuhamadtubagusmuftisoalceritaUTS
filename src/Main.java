import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Deklarasi variabel
        String[] kodeBarang = {"K001", "K002", "K003", "K004", "K005", "K006", "K007", "K008", "K009", "K010"};
        String[] namaBarang = {"Foundation", "Lipstick", "Eyeshadow Palette", "Mascara", "Blush", "Makeup Setting Spray", "Eyeliner", "Lip Gloss", "BB Cream", "Highlighter"};
        double[] hargaBarang = {50.0, 35.0, 60.0, 25.0, 40.0, 70.0, 55.0, 30.0, 45.0, 65.0};

        // Inisialisasi scanner untuk input
        Scanner scanner = new Scanner(System.in);

        // Memulai transaksi
        double totalHarga = 0.0;
        System.out.println("Selamat datang di Aplikasi Penjualan Kosmetik");

        for (int i = 0; i < kodeBarang.length; i++) {
            System.out.println("---------------------------");
            System.out.println("Kode Barang: " + kodeBarang[i]);
            System.out.println("Nama Barang: " + namaBarang[i]);
            System.out.println("Harga: " + hargaBarang[i] + " per unit");

            // Input jumlah barang yang dibeli
            System.out.print("Jumlah yang dibeli: ");
            int qty = scanner.nextInt();

            // Menghitung total harga untuk barang tersebut
            double subtotal = qty * hargaBarang[i];
            totalHarga += subtotal;

            // Menampilkan detail transaksi
            System.out.println("Subtotal: " + subtotal);
        }

        // Menampilkan total jumlah invoice
        System.out.println("---------------------------");
        System.out.println("Total Jumlah Invoice: " + totalHarga);

        // Menutup scanner
        scanner.close();
    }
}
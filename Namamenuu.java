
package namamenuu;

import java.util.Scanner;

public class Namamenuu {
    private String namaMenu;
    private double harga;
    private String deskripsi;
    private String kategori;
    private int stok;

    
    public Namamenuu(String namaMenu, double harga, String deskripsi, String kategori, int stok) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.stok = stok;
    }

    
    public void tampilInfoMenu() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga: Rp." + harga);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("promo: " + kategori);
        System.out.println("Stok: " + stok);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan informasi menu:");

        System.out.print("Nama Menu: ");
        String namaMenu = input.nextLine();

        System.out.print("Harga: Rp.");
        double harga = input.nextDouble();
        input.nextLine(); // Membuang karakter newline

        System.out.print("Deskripsi: ");
        String deskripsi = input.nextLine();

        System.out.print("promo: ");
        String kategori = input.nextLine();

        System.out.print("Stok: ");
        int stok = input.nextInt();

        
       Namamenuu menu = new Namamenuu(namaMenu, harga, deskripsi, kategori, stok);

        System.out.println("\nInformasi Menu yang telah dimasukkan:");
        menu.tampilInfoMenu();

        input.close();
    }
}

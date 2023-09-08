import java.util.Scanner;
public class CatatanUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, pilih;
        User us = new User();

        do {
            System.out.println();
            System.out.println("===========================================");
            System.out.println("|               Menu Catatan              |");
            System.out.println("===========================================");
            System.out.println("| 1. Input Data User                      |");
            System.out.println("| 2. Cetak Semua User                     |");
            System.out.println("| 3. Keluar                               |");
            System.out.println("===========================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data User");
                    System.out.print("Nama User: ");
                    us.nama[i] = sc.nextLine();
                    System.out.print("Alamat User: ");
                    us.alamat[i] = sc.nextLine();
                    System.out.print("No HP: ");
                    us.noHp[i] = sc.nextLine();
                    i++;
                    break;

                case 2:
                    System.out.println();
                    System.out.println("=======================");
                    System.out.println("|      List User      |");
                    System.out.println("=======================");
                    us.cetakUser();
                    break;
                case 3:
                    System.exit(0);
            }
            if (pilih > 3) {
                System.out.println("Menu Tidak Ada");
            }
        } while (pilih > 0);
        sc.close();
    }
}

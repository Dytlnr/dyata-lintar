import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Admin admin = new Admin();
        admin.init();
        while(true) {
            Scanner input = new Scanner(System.in);
            int pilihan;
            System.out.println("Selamat datang di sistem login library.");
            System.out.println("Silakan pilih jenis user:");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                // Login mahasiswa
                String nim;

                System.out.print("Masukkan NIM: ");
                nim = String.valueOf(new Scanner(System.in).nextLine());

                if (nim.length() == 15) {
                    // Login berhasil
                    System.out.println("Login berhasil sebagai mahasiswa dengan NIM " + nim);
                } else {
                    // Login gagal
                    System.out.println("Login gagal. NIM harus terdiri dari 15 karakter.");
                }
            } else if (pilihan == 2) {
                // Login admin
                String username, password;

                System.out.print("Masukkan username: ");
                username = new Scanner(System.in).nextLine();

                System.out.print("Masukkan password: ");
                password = new Scanner(System.in).nextLine();

                if (admin.isAuthenticated(username, password)) {
                    // Login berhasil
                    System.out.println("Login berhasil sebagai admin.");
                } else {
                    // Login gagal
                    System.out.println("Login gagal. Username atau password salah.");
                }
            } else {
                // Pilihan tidak valid
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
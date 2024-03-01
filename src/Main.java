import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scannegiyr.nextLine();

        // Input jenis kelamin (singkatan P atau L)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Validasi jenis kelamin
        String jenisKelaminLengkap = (jenisKelamin == 'L') ? "Laki-laki" : (jenisKelamin == 'P') ? "Perempuan" : "Tidak valid";

        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.next();

        // Konversi String ke LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur menggunakan java.time.Period
        LocalDate today = LocalDate.now();
        Period selisihUmur = Period.between(tanggalLahir, today);

        // Output informasi
        System.out.println("\nInformasi Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + selisihUmur.getYears() + " tahun, " + selisihUmur.getMonths() + " bulan, " + selisihUmur.getDays() + " hari");

        // Menutup scanner
        scanner.close();
    }
}
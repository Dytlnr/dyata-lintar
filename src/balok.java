import java.util.Scanner;

class Balok extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double panjang, lebar, tinggi;

    Balok(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input panjang: ");
        panjang = scan.nextDouble();
        System.out.print("Input lebar: ");
        lebar = scan.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = scan.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * ((panjang * lebar) + ( panjang * tinggi ) + ( lebar * tinggi ));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan " + getName() + " : " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang*lebar*tinggi;
        super.volume();
        System.out.println("Hasil volume " + getName() + " : " + hasil);
    }
}
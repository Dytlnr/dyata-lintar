import java.util.Scanner;


class Kubus extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    private double sisi;

    Kubus(String nameBangun) {

        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        sisi = scan.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan " + getName() + " : " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume " + getName() + " : " + hasil);
    }
}
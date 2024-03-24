 class App {
    public static void main(String[] args) {

        Tabung tabung = new Tabung ("tabung");
        Kubus kubus = new Kubus ("kubus");
        Balok balok = new Balok ("balok");

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();
        System.out.println();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
        System.out.println();

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();
        System.out.println();

    }
}
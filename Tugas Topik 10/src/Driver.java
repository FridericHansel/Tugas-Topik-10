public class Driver extends Member {

    private final String noplat, jenis;

    public Driver(String noplat, String jenis, String nik, String nama, String notelp, double saldo){
        super(nik, nama, notelp, saldo);
        this.noplat = noplat;
        this.jenis = jenis;
    }

    @Override
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Data Driver");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No telp: " + notelp);
        System.out.println("Saldo: " + saldo);
        System.out.println("No plat: " + noplat);
        System.out.println("Jenis: " + jenis);
    }
}

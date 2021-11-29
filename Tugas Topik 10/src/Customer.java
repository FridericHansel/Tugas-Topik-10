public class Customer extends Member{

    public Customer(String nik, String nama, String notelp, double saldo){
        super(nik,nama,notelp,saldo);
    }

    @Override
    public void display() {
        System.out.println("----------------------------");
        System.out.println("Data Customer");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No telp: " + notelp);
        System.out.println("Saldo: " + saldo);
    }
}

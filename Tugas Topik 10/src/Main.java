import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private final ArrayList<Member> member = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);

    private void inputCustomer(){
        System.out.println("\nMasukkan data Customer");
        System.out.println("NIK: ");
        String nik = scan.next();
        System.out.println("Nama : ");
        String nama = scan.next();
        System.out.println("Notelp: ");
        String notelp = scan.next();
        System.out.println("Saldo: ");
        double saldo = scan.nextDouble();
        member.add(new Customer(nik,nama,notelp,saldo));
    }

    private void inputDriver(){
        System.out.println("\nMasukkan data Driver");
        System.out.println("NIK: ");
        String nik = scan.next();
        System.out.println("Nama : ");
        String nama = scan.next();
        System.out.println("Notelp: ");
        String notelp = scan.next();
        System.out.println("No Plat: ");
        String noplat = scan.next();
        System.out.println("Jenis: ");
        String jenis = scan.next();
        System.out.println("Saldo: ");
        double saldo = scan.nextDouble();
        member.add(new Driver(noplat,jenis,nik,nama,notelp,saldo));
    }

    private void displayMember(){
        for (Member m : member){
            m.display();
        }
    }

    private Member searchById(String id){
        Member m = null;
        for (Member x : member){
            if (x.getNik().equals(id)){
                m = x;
                break;
            }
        }
        return m;
    }

    private void transaksi(int tipe){
        System.out.println("\nLakukan Transaksi");
        System.out.println("ID Customer: ");
        String idCust = scan.next();
        System.out.println("ID Driver: ");
        String idDriver = scan.next();
        System.out.println("Biaya: ");
        double biaya = scan.nextDouble();

        Member c = searchById(idCust);
        Member d = searchById(idDriver);

        if (c != null && d != null && (c instanceof Customer) && (d instanceof Driver)){
            if (tipe == 0){
                c.transaksi(d,biaya);
            }else {
                d.transaksi(c, biaya);
            }
        }
    }

    private void main(){
        int menu;
        do {
            System.out.println("Menu");
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Display Data");
            System.out.println("4. Top-Up");
            System.out.println("5. Antar Penumpang");
            System.out.println("6. Keluar");
            System.out.println("Masukkan Pilihan: ");
            menu = scan.nextInt();
            switch (menu){
                case 1:
                    inputDriver();
                    break;
                case 2:
                    inputCustomer();
                    break;
                case 3:
                    displayMember();
                    break;
                case 4:
                    transaksi(0);
                    break;
                case 5:
                    transaksi(1);
                    break;
                case 6:
                    System.out.println("Selamat Jalan");
                    System.exit(0);
            }
        }while (menu != 6);
    }

    public static void main(String [] args){
        Main main = new Main();
        main.main();
    }
}

public abstract class Member {
    protected final String nik, nama, notelp;
    protected double saldo;

    public Member(String nik, String nama, String notelp, double saldo){
        this.nik = nik;
        this.nama = nama;
        this.notelp = notelp;
        this.saldo = saldo;
    }
    public void transaksi(Member other, double biaya){
        this.saldo = this.saldo + biaya;
        other.saldo = other.saldo - biaya;
    }
    public String getNik(){
        return nik;
    }
    public abstract void display();

}

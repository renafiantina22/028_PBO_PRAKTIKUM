public class Barang {
    private String kodeBarang;
    private String nama;
    private String kondisi;

    public Barang(String kodeBarang, String nama, String kondisi) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kondisi = kondisi;

    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public String getKondisi() {
        return kondisi;
    }

    //behavior

    public void tandaiRusak() {
        this.kondisi = "RUSAK";
    }
    public void tandaiHilang() {
        this.kondisi = "HILANG";
    }

    public void perbaiki(){
        this.kondisi = "BAGUS";  
    }

    public void periksaKondisi() {
        System.out.println("Kondisi barang: " + kondisi);
    }

}
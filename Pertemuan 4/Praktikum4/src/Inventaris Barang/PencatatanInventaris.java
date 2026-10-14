public class PencatatanInventaris {
    private String kodePencatatan;
    private Barang barang;
    private Lokasi lokasi;
    
    public PencatatanInventaris(String kodePencatatan, Barang barang, Lokasi lokasi) {
        this.kodePencatatan = kodePencatatan;
        this.barang = barang;
        this.lokasi = lokasi;
    }

    public String getkodePencatatan() {
        return kodePencatatan;
    }
    public Barang getbarang() {
        return barang;
    }
    public Lokasi getlokasi() {
        return lokasi;
    }

    public void tampilkanData() {
        System.out.println("Kode Pencatatan : " + getkodePencatatan());
        System.out.println("Kode Barang : " + barang.getKodeBarang());
        System.out.println("Nama Barang : " + barang.getNama());
        System.out.println("Kode Lokasi : " + lokasi.getKodeLokasi());
    } 

} 
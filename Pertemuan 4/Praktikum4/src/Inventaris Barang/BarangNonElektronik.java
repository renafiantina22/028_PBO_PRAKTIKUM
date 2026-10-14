public class BarangNonElektronik extends Barang {

    public BarangNonElektronik(String kodeBarang, String nama, String kondisi) {
        super(kodeBarang, nama, kondisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.print("Pemeriksaan barang non-elektronik: ");
        super.periksaKondisi();
    }
}

public class BarangElektronik extends Barang {

    public BarangElektronik(String kodeBarang, String nama, String kondisi) {
        super(kodeBarang, nama, kondisi);
    }

    @Override
    public void periksaKondisi() {
        System.out.print("Pemeriksaan barang elektronik: ");
        super.periksaKondisi();
    }
}

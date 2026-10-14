
public class Main {
    public static void main(String[] args) {
        Barang barang1 = new BarangElektronik(
            "BRG001", "Laptop", "BAGUS"
        );

        Barang barang2 = new BarangElektronik(
            "BRG002", "Proyektor", "RUSAK"
        );

        Barang barang3 = new BarangNonElektronik(
            "BRG003", "Meja", "BAGUS"
        );

        Barang barang4 = new BarangNonElektronik(
            "BRG004", "Kursi", "RUSAK"
        );

        Lokasi lokasi1 = new Lokasi("R001", "Lab Komputer");
        Lokasi lokasi2 = new Lokasi("R002", "Ruang Kelas");

        PencatatanInventaris pencatatan1 =
            new PencatatanInventaris("PC001", barang1, lokasi1);

        PencatatanInventaris pencatatan2 =
            new PencatatanInventaris("PC002", barang2, lokasi2);

        PencatatanInventaris pencatatan3 =
            new PencatatanInventaris("PC003", barang3, lokasi2);

        PencatatanInventaris pencatatan4 =
            new PencatatanInventaris("PC004", barang4, lokasi2);

        System.out.println("===== DATA INVENTARIS =====");
        pencatatan1.tampilkanData();
        System.out.println();
        pencatatan2.tampilkanData();
        System.out.println();
        pencatatan3.tampilkanData();
        System.out.println();
        pencatatan4.tampilkanData();

        System.out.println("\n===== PENGUJIAN OVERRIDING =====");
        barang1.periksaKondisi();
        barang3.periksaKondisi();

        System.out.println("\n===== CHECK BEHAVIOR LAMA =====");
        System.out.println("Status barang 1 sebelumnya:");
        System.out.println(barang1.getKondisi());

        barang1.tandaiRusak();

        System.out.println("Status barang 1 sesudah tandaiRusak():");
        System.out.println(barang1.getKondisi());
    }
}

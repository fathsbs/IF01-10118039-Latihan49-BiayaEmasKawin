/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk meghitung total bayar membeli emas  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        emas.setNama("Hendi");
        emas.setBeratEmas(15.7);
        emas.setHargaEmas(570000);
        emas.tampilPembedli(emas.totalHarga(emas.getHargaEmas()));
    }

}

public class palindrome {

    public static boolean cekPalindromeIteratif(String kode) {
        int kiri = 0;
        int kanan = kode.length() - 1;

        while (kiri < kanan) {
            if (kode.charAt(kiri) != kode.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }

    public static boolean cekPalindromeRekursif(String kode, int kiri, int kanan) {
        if (kiri >= kanan) {
            return true;
        }
        if (kode.charAt(kiri) != kode.charAt(kanan)) {
            return false;
        }
        return cekPalindromeRekursif(kode, kiri + 1, kanan - 1);
    }

    public static void main(String[] args) {

        String[] daftarKodeBarang = {
            "ABCCBA",
            "ABCBA",
            "ABCDE",
            "1221",
            "A1B2B1A"
        };

        System.out.println("VALIDASI KODE BARANG GUDANG");
        System.out.println("==========================");

        for (String kode : daftarKodeBarang) {

            boolean hasilIteratif = cekPalindromeIteratif(kode);
            boolean hasilRekursif = cekPalindromeRekursif(kode, 0, kode.length() - 1);

            System.out.println("\nKode Barang : " + kode);
            System.out.println("Iteratif   : " + (hasilIteratif ? "VALID" : "TIDAK VALID"));
            System.out.println("Rekursif   : " + (hasilRekursif ? "VALID" : "TIDAK VALID"));
        }
    }
}

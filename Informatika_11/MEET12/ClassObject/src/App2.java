class Siswa {
    String nama = "Kaka";
    int nim;
    String jurusan;

    Siswa(String paramNama, int paramNim, String paramJurusan) {
        nama = paramNama;
        nim = paramNim;
        jurusan = paramJurusan;
        System.out.println("Nama saya " + nama + " dengan nim = " + nim + " sekarang ada di jurusan " + jurusan);
    }

    Siswa(Sring paramNama) {
        System.out.println("Namaku adalah " + paramNama + "temanku adalah " + nama);
    }
}

public class App2 {
    public static void main(String[] args) {
        Siswa siswa01 = new Siswa("Budi", 1234, "IPA KOMPUTER");
        Siswa siswa02 = new Siswa("Martin", 4321, "IPA KEDOKTERAN");
    }
}
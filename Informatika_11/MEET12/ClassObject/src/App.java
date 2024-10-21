class Siswa{
    String nama;
    String kelas;
    int nim;
    double nilai;
}

public class App {
    public static void main(String[] args) {
        {
            Siswa siswa01 = new Siswa();
            siswa01.nama = "Martin";
            siswa01.kelas = "IPA 1";
            siswa01.nim = 12345;
            siswa01.nilai = 99.5;
        }
    }
}

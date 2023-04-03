package sehat;

public class Main {
    public static void main(String[] args) {
        antrian iniAntrian = new antrian();

        iniAntrian.ambilAntrian("A001", "Ita Lingga", "Mandiri");
        iniAntrian.ambilAntrian("A002", "Rita Sugiarto", "BPJS");
        iniAntrian.ambilAntrian("B001", "Riki Subagja", "Mandiri");
        iniAntrian.ambilAntrian("B002", "Alan Budikusuma", "Mandiri");

        iniAntrian.panggilan("A001");
        iniAntrian.panggilan("C001");
        
        iniAntrian.ambilAntrian("C001", "Susi Susanti", "BPJS");
        iniAntrian.panggilan("C001");

        iniAntrian.hapusAntrian();
        iniAntrian.panggilan("B001");
    }
}

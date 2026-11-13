package Latihan2;

class GradeCalculator {

    public double hitungNilaiAkhir(
            double tugas,
            double uts,
            double uas
    ) {
        return (tugas * 0.3)
                + (uts * 0.3)
                + (uas * 0.4);
    }
}

class GradeReportPrinter {

    public void cetakLaporan(
            String nama,
            double nilai
    ) {
        System.out.println(
                "Laporan Nilai Mahasiswa: "
                        + nama + " = " + nilai
        );
    }
}

interface GradeRepository {

    void simpanDatabase(
            String nama,
            double nilai
    );
}

class DatabaseGradeRepository
        implements GradeRepository {

    public void simpanDatabase(
            String nama,
            double nilai
    ) {
        System.out.println(
                "Menyimpan ke database: "
                        + nama + " = " + nilai
        );
    }
}

public class Main {

    public static void main(String[] args) {

        GradeCalculator calculator =
                new GradeCalculator();

        GradeReportPrinter printer =
                new GradeReportPrinter();

        GradeRepository repository =
                new DatabaseGradeRepository();

        double nilai = calculator.hitungNilaiAkhir(
                80, 85, 90
        );

        printer.cetakLaporan("Andi", nilai);

        repository.simpanDatabase("Andi", nilai);
    }
}

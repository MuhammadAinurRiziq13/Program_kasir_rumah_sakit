/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasirrumahsakit;

import java.util.Scanner;

public class KasirRumahSakit {
    static void headerStruct() {
        System.out.println();
        System.out.println("STRUK DICETAK.............................");
        System.out.println("______________");
        System.out.println("_________________________________________________________________________________");
        System.out.println("|                    PERINCIAN BIAYA RUMAH SAKIT UMUM MALANG                     |");
        System.out.println("|________________________________________________________________________________|");
        System.out.println();

    }

    static void structPoliUmum(String pasien, int nomor, String bpjs, String poliklinik[], int poli, String poliUmum[],
            int total, int potongan, int hargaAkhir, int p, int jenisPerawatan[], int hargaAwal[][], String dokter[],
            int pembayaran, int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t: " + dokter[0]);
        System.out.println("Jenis Pelayanan \t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(poliUmum[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t: " + poliUmum[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {
            System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                    poliUmum[jenisPerawatan[i] - 1], hargaAwal[0][jenisPerawatan[i] - 1],
                    hargaAwal[0][jenisPerawatan[i] - 1]);
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t: " + total);
        System.out.println("Potongan\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);
    }

    static void structPenyakitDalam(String pasien, int nomor, String bpjs, String poliklinik[], int poli,
            String poliPenyakitDalam[], int hari, int hargaKamar, int totalKamar, int infus,
            int hargaInfus, int totalInfus, int obat[], int hargaObatPenyakitDalam[], int totalObat[],
            int potongan, int hargaAkhir, int p, int jenisPerawatan[], String jenisObatPenyakitDalam[], int total,
            int hargaAwal[][], String dokter[], int pembayaran, int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t: " + dokter[1]);
        System.out.println("Jenis Pelayanan \t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(poliPenyakitDalam[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t: " + poliPenyakitDalam[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {

            System.out.printf("Perawatan %s \t\t  1\t\t%d\t\t%d\n",
                    jenisObatPenyakitDalam[jenisPerawatan[i] - 1], hargaAwal[1][jenisPerawatan[i] - 1],
                    hargaAwal[1][jenisPerawatan[i] - 1]);

        }
        System.out.printf("Kamar Inap\t\t\t  %d\t\t%d\t\t%d\n", hari, hargaKamar, totalKamar);
        System.out.printf("Pemberian Infus\t\t\t  %d\t\t%d\t\t%d\n", infus, hargaInfus, totalInfus);
        for (int i = 0; i < p; i++) {
            System.out.printf("Pemberian Obat %s \t  %d\t\t%d\t\t%d\n",
                    jenisObatPenyakitDalam[jenisPerawatan[i] - 1], obat[i],
                    hargaObatPenyakitDalam[jenisPerawatan[i] - 1], totalObat[i]);
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t: " + total);
        System.out.println("Potongan\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);
    }

    static void structPoliGigi(String pasien, int nomor, String bpjs, String poliklinik[], int poli, String poliGigi[],
            int jenisPerawatan[], int total, int potongan, int hargaAkhir, int p, int hargaAwal[][], String dokter[],
            int pembayaran, int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t\t: " + dokter[2]);
        System.out.println("Jenis Pelayanan \t\t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(poliGigi[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t\t: " + poliGigi[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {
            if (poliGigi[jenisPerawatan[i] - 1] == poliGigi[1]) {
                System.out.printf("%s \t\t\t\t  1\t\t%d\t\t%d\n",
                        poliGigi[jenisPerawatan[i] - 1], hargaAwal[2][jenisPerawatan[i] - 1],
                        hargaAwal[2][jenisPerawatan[i] - 1]);
            } else if (poliGigi[jenisPerawatan[i] - 1] == poliGigi[2]) {
                System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                        poliGigi[jenisPerawatan[i] - 1], hargaAwal[2][jenisPerawatan[i] - 1],
                        hargaAwal[2][jenisPerawatan[i] - 1]);
            } else if (poliGigi[jenisPerawatan[i] - 1] == poliGigi[4]) {
                System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                        poliGigi[jenisPerawatan[i] - 1], hargaAwal[2][jenisPerawatan[i] - 1],
                        hargaAwal[2][jenisPerawatan[i] - 1]);
            } else {
                System.out.printf("%s \t  1\t\t%d\t\t%d\n",
                        poliGigi[jenisPerawatan[i] - 1], hargaAwal[2][jenisPerawatan[i] - 1],
                        hargaAwal[2][jenisPerawatan[i] - 1]);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t\t: " + total);
        System.out.println("Potongan\t\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);
    }

    static void structPoliAnak(String pasien, int nomor, String bpjs, String poliklinik[], int poli, String poliAnak[],
            int jenisPerawatan[], int total, int potongan, int hargaAkhir, int p, int hargaAwal[][], String dokter[],
            int pembayaran, int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t\t: " + dokter[3]);
        System.out.println("Jenis Pelayanan \t\t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(poliAnak[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t\t: " + poliAnak[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {
            if (poliAnak[jenisPerawatan[i] - 1] == poliAnak[1]) {
                System.out.printf("%s \t\t\t\t  1\t\t%d\t\t%d\n",
                        poliAnak[jenisPerawatan[i] - 1], hargaAwal[3][jenisPerawatan[i] - 1],
                        hargaAwal[3][jenisPerawatan[i] - 1]);
            } else if (poliAnak[jenisPerawatan[i] - 1] == poliAnak[2]) {
                System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                        poliAnak[jenisPerawatan[i] - 1], hargaAwal[3][jenisPerawatan[i] - 1],
                        hargaAwal[3][jenisPerawatan[i] - 1]);
            } else if (poliAnak[jenisPerawatan[i] - 1] == poliAnak[4]) {
                System.out.printf("%s \t\t\t  1\t\t%d\t\t%d\n",
                        poliAnak[jenisPerawatan[i] - 1], hargaAwal[3][jenisPerawatan[i] - 1],
                        hargaAwal[3][jenisPerawatan[i] - 1]);
            } else if (poliAnak[jenisPerawatan[i] - 1] == poliAnak[0]) {
                System.out.printf("%s \t\t\t  1\t\t%d\t\t%d\n",
                        poliAnak[jenisPerawatan[i] - 1], hargaAwal[3][jenisPerawatan[i] - 1],
                        hargaAwal[3][jenisPerawatan[i] - 1]);
            } else {
                System.out.printf("%s \t  1\t\t%d\t\t%d\n",
                        poliAnak[jenisPerawatan[i] - 1], hargaAwal[3][jenisPerawatan[i] - 1],
                        hargaAwal[3][jenisPerawatan[i] - 1]);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t\t: " + total);
        System.out.println("Potongan\t\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);

    }

    static void structIGD(String pasien, int nomor, String bpjs, String poliklinik[], int poli,
            String instalasiGawatDarurat[], int hari, int hargaKamar, int totalKamar, int infus,
            int hargaInfus, int totalInfus, int obat[], int hargaObatPenyakitDalam[], int totalObat[],
            int potongan, int hargaAkhir, int p, int jenisPerawatan[], String jenisObatPenyakitDalam[], int total,
            int hargaAwal[][], int ambulance, int hargaAmbulance, int totalAmbulance, String dokter[], int pembayaran,
            int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t: " + dokter[4]);
        System.out.println("Jenis Pelayanan \t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(instalasiGawatDarurat[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t: " + instalasiGawatDarurat[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {
            System.out.printf("Perawatan %s \t\t  1\t\t%d\t\t%d\n",
                    instalasiGawatDarurat[jenisPerawatan[i] - 1], hargaAwal[4][jenisPerawatan[i] - 1],
                    hargaAwal[4][jenisPerawatan[i] - 1]);
        }
        System.out.printf("Ambulance\t\t\t  %d\t\t%d\t\t%d\n", ambulance, hargaAmbulance, totalAmbulance);
        System.out.printf("Kamar Inap\t\t\t  %d\t\t%d\t\t%d\n", hari, hargaKamar, totalKamar);
        System.out.printf("Pemberian Infus\t\t\t  %d\t\t%d\t\t%d\n", infus, hargaInfus, totalInfus);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t: " + total);
        System.out.println("Potongan\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);
    }

    static void structPoliKulitDanKelamin(String pasien, int nomor, String bpjs, String poliklinik[], int poli,
            String poliKulitDanKelamin[],
            int jenisPerawatan[], int total, int potongan, int hargaAkhir, int p, int hargaAwal[][], String dokter[],
            int pembayaran, int kembalian) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama \t\t\t\t\t: " + pasien);
        System.out.println("Nomor Registrasi\t\t\t: " + nomor);
        System.out.println("Mempunyai BPJS  \t\t\t: " + bpjs);
        System.out.println("Dokter \t\t\t\t\t: " + dokter[5]);
        System.out.println("Jenis Pelayanan \t\t\t: " + poliklinik[poli - 1]);
        System.out.print("Jenis Perawatan \t\t\t: ");
        for (int i = 0; i < p; i++) {
            if (i == 0) {
                System.out.println(poliKulitDanKelamin[jenisPerawatan[i] - 1]);
            } else {
                System.out.println("\t\t\t\t\t: " + poliKulitDanKelamin[jenisPerawatan[i] - 1]);
            }

        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Tindakan\t\t\t\tkuantitas\tTarif\t\tTotal");
        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < p; i++) {
            if (poliKulitDanKelamin[jenisPerawatan[i] - 1] == poliKulitDanKelamin[0]) {
                System.out.printf("%s \t\t\t\t  1\t\t%d\t\t%d\n",
                        poliKulitDanKelamin[jenisPerawatan[i] - 1], hargaAwal[5][jenisPerawatan[i] - 1],
                        hargaAwal[5][jenisPerawatan[i] - 1]);
            } else if (poliKulitDanKelamin[jenisPerawatan[i] - 1] == poliKulitDanKelamin[1]) {
                System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                        poliKulitDanKelamin[jenisPerawatan[i] - 1], hargaAwal[5][jenisPerawatan[i] - 1],
                        hargaAwal[5][jenisPerawatan[i] - 1]);
            } else if (poliKulitDanKelamin[jenisPerawatan[i] - 1] == poliKulitDanKelamin[2]) {
                System.out.printf("%s \t\t  1\t\t%d\t\t%d\n",
                        poliKulitDanKelamin[jenisPerawatan[i] - 1], hargaAwal[5][jenisPerawatan[i] - 1],
                        hargaAwal[5][jenisPerawatan[i] - 1]);
            } else {
                System.out.printf("%s \t\t\t  1\t\t%d\t\t%d\n",
                        poliKulitDanKelamin[jenisPerawatan[i] - 1], hargaAwal[5][jenisPerawatan[i] - 1],
                        hargaAwal[5][jenisPerawatan[i] - 1]);
            }
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Sub Total\t\t\t\t: " + total);
        System.out.println("Potongan\t\t\t\t: " + potongan);
        System.out.println("Total Yang Harus Dibayar\t\t: " + hargaAkhir);
        System.out.println("----------------------------------------------------------------------------------");
        do {
            System.out.print("Jumlah uang yang dibayarkan\t: ");
            pembayaran = sc.nextInt();
            kembalian = pembayaran - hargaAkhir;
            System.out.println("Kembalian\t\t\t: " + kembalian);
            if (kembalian < 0) {
                System.out.println("\tUang yang anda masukkan kurang!!");
            }
        } while (kembalian < 0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String poliklinik[] = { "POLI Umum", "POLI Penyakit Dalam", "POLI Gigi",
                "POLI Anak", "Instalasi Gawat Darurat", "POLI Kulit dan Kelamin" };
        String poliUmum[] = { "Surat Kesehatan ", "Pemeriksaan Umum",
                "Medikasi Ringan ", "Medikasi Sedang", "Medikasi Berat " };
        String poliPenyakitDalam[] = { "keluhan pada sistem pernapasan", "keluhan pada sistem pencernaan",
                "keluhan pada organ hati", "keluhan pada jantung", "keluhan pada ginjal" };
        String poliGigi[] = { "Pemeriksaan gigi dan Konsultasi", "Tumpatan Gigi",
                "Pencabutan gigi tanpa suntikan", "Pencabutan gigi dengan suntikan  ", "Pembersihan karang gigi" };
        String poliAnak[] = { "Kesehatan Anak Umum", "Respirologi", "Nutrisi dan Penyakit Metabolik",
                "Tumbuh kembang dan Pediatri Sosial", "Alergi imunologi" };
        String instalasiGawatDarurat[] = { "Resusitasi", "PICU Primer", "PICU Skunder", "PICU Tersier",
                "Radiologi" };
        String poliKulitDanKelamin[] = { "Perawatan Umum", "Infeksi bakteri & parasit", "Mikologi & infeksi virus",
                "Tumor & Bedah kulit", "Alergi & Imunologi" };
        String dokter[] = { "dr. Bayu Purnomo", "dr. Dani Saputra, sp.PD", "drg. Rahayu Putri Cantika",
                "dr. Wahyuni Permatasani, sp.A", "dr. Irfan Fanani", "dr. Budi Raharjo, sp.KK" };
        String jenisObatPenyakitDalam[] = { "pernapasan", "pencernaan",
                "organ hati", "jantung ", "ginjal  " };
        int hargaAwal[][] = {
                { 30000, 30000, 20000, 40000, 60000 },
                { 230000, 220000, 280000, 300000, 260000 },
                { 40000, 100000, 150000, 200000, 180000 },
                { 50000, 80000, 90000, 110000, 125000 },
                { 250000, 380000, 410000, 440000, 1400000 },
                { 150000, 175000, 200000, 440000, 160000 }
        };
        int jenisPerawatan[] = new int[10];
        int obat[] = new int[10];
        int totalObat[] = new int[10];
        int hargaObatPenyakitDalam[] = { 150000, 120000, 190000, 210000, 175000 };
        int hargaKamar = 500000;
        int hargaInfus = 60000;
        int hargaAmbulance = 100000;
        int potongan = 0, total = 0, poli = 0, hari = 0, totalKamar = 0, infus = 0, totalInfus = 0, ambulance = 0,
                totalAmbulance = 0, hargaAkhir = 0, nomor = 0;
        String bpjs = "";
        String pasien = "";
        int z = 0, pembayaran = 0, kembalian = 0;
        for (String tambahStruct = "iya"; tambahStruct.equalsIgnoreCase("iya"); z++) {
            System.out.println("==================================================================");
            System.out.println("||              PEMBAYARAN RUMAH SAKIT UMUM MALANG              ||");
            System.out.println("==================================================================");
            System.out.println();
            System.out.println("Masukkan Identitas Pasien ");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Nama \t\t\t\t: ");
            if (z < 1) {
                pasien = sc.nextLine();
            } else {
                pasien = sc.nextLine();
                pasien = sc.nextLine();
            }
            System.out.print("Nomor Registrasi\t\t: ");
            nomor = sc.nextInt();
            System.out.print("Mempunyai BPJS [iya/tidak]\t: ");
            bpjs = sc.next();

            System.out.println("Jenis-Jenis Pelayanan\t\t: ");

            for (int i = 0; i < poliklinik.length; i++) {
                System.out.println((i + 1) + ". " + poliklinik[i]);
            }
            do {
                int p = 0;
                System.out.print("Jenis Pelayanan Yang Dipilih\t: ");
                poli = sc.nextInt();
                System.out.println();

                if (poli == 1) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < poliUmum.length; i++) {
                        System.out.println((i + 1) + ". " + poliUmum[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();
                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;

                        }

                    }
                    for (int i = 0; i < p; i++) {
                        total += hargaAwal[0][jenisPerawatan[i] - 1];
                    }

                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structPoliUmum(pasien, nomor, bpjs, poliklinik, poli, poliUmum, total, potongan, hargaAkhir, p,
                            jenisPerawatan, hargaAwal, dokter, pembayaran, kembalian);

                } else if (poli == 2) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < poliPenyakitDalam.length; i++) {
                        System.out.println((i + 1) + ". " + poliPenyakitDalam[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();

                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;
                        }

                    }

                    System.out.print("Jumlah Hari Pasien Dirawat: ");
                    hari = sc.nextInt();
                    totalKamar = hari * hargaKamar;
                    System.out.print("Jumlah Botol Infus Yang terpakai: ");
                    infus = sc.nextInt();
                    totalInfus = infus * hargaInfus;
                    total = totalInfus + totalKamar;
                    for (int i = 0; i < p; i++) {
                        System.out
                                .print("Berapa Kali Pasien Diberi Obat " + poliPenyakitDalam[jenisPerawatan[i] - 1]
                                        + ": ");
                        obat[i] = sc.nextInt();
                        totalObat[i] += obat[i] * hargaObatPenyakitDalam[jenisPerawatan[i] - 1];
                        total += hargaAwal[1][jenisPerawatan[i] - 1] + totalObat[i];
                    }

                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structPenyakitDalam(pasien, nomor, bpjs, poliklinik, poli, poliPenyakitDalam, hari, hargaKamar,
                            totalKamar, infus, hargaInfus, totalInfus, obat, hargaObatPenyakitDalam, totalObat,
                            potongan, hargaAkhir, p, jenisPerawatan, jenisObatPenyakitDalam, total, hargaAwal, dokter,
                            pembayaran, kembalian);
                } else if (poli == 3) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < poliGigi.length; i++) {
                        System.out.println((i + 1) + ". " + poliGigi[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();
                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;
                        }

                    }
                    for (int i = 0; i < p; i++) {
                        total += hargaAwal[2][jenisPerawatan[i] - 1];
                    }
                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structPoliGigi(pasien, nomor, bpjs, poliklinik, poli, poliGigi, jenisPerawatan, total, potongan,
                            hargaAkhir, p, hargaAwal, dokter, pembayaran, kembalian);
                } else if (poli == 4) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < poliAnak.length; i++) {
                        System.out.println((i + 1) + ". " + poliAnak[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();
                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;
                        }

                    }
                    for (int i = 0; i < p; i++) {
                        total += hargaAwal[3][jenisPerawatan[i] - 1];
                    }

                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structPoliAnak(pasien, nomor, bpjs, poliklinik, poli, poliAnak, jenisPerawatan, total, potongan,
                            hargaAkhir, p, hargaAwal, dokter, pembayaran, kembalian);
                } else if (poli == 5) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < instalasiGawatDarurat.length; i++) {
                        System.out.println((i + 1) + ". " + instalasiGawatDarurat[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();
                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;
                        }

                    }
                    System.out.print("Jumlah Hari Pasien Dirawat: ");
                    hari = sc.nextInt();
                    totalKamar = hari * hargaKamar;
                    System.out.print("Jumlah Botol Infus Yang terpakai: ");
                    infus = sc.nextInt();
                    totalInfus = infus * hargaInfus;
                    System.out.print("Jumlah Memakai Ambulance: ");
                    ambulance = sc.nextInt();
                    totalAmbulance = ambulance * hargaAmbulance;
                    total = totalInfus + totalKamar + totalAmbulance;

                    for (int i = 0; i < p; i++) {
                        total += hargaAwal[4][jenisPerawatan[i] - 1];
                    }

                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structIGD(pasien, nomor, bpjs, poliklinik, poli, instalasiGawatDarurat, hari, hargaKamar,
                            totalKamar, infus, hargaInfus, totalInfus, obat, hargaObatPenyakitDalam, totalObat,
                            potongan, hargaAkhir, p, jenisPerawatan, jenisObatPenyakitDalam, total, hargaAwal,
                            ambulance, hargaAmbulance, totalAmbulance, dokter, pembayaran, kembalian);
                } else if (poli == 6) {
                    System.out.println("Jenis-Jenis Perawatan\t\t:");
                    for (int i = 0; i < poliKulitDanKelamin.length; i++) {
                        System.out.println((i + 1) + ". " + poliKulitDanKelamin[i]);
                    }
                    for (String tambahPerawatan = "iya"; tambahPerawatan.equalsIgnoreCase("iya");) {
                        System.out.print("Jenis Perawatan Yang Dipilih\t: ");
                        jenisPerawatan[p] = sc.nextInt();
                        if (jenisPerawatan[p] > 5 || jenisPerawatan[p] < 1) {
                            System.out.println();
                            System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                            System.out.println();
                            tambahPerawatan = "iya";
                        } else {
                            System.out.print("Apakah ingin menambahkan perawatan [iya/tidak] ? ");
                            tambahPerawatan = sc.next();
                            p++;
                        }

                    }
                    for (int i = 0; i < p; i++) {
                        total += hargaAwal[5][jenisPerawatan[i] - 1];
                    }

                    if (bpjs.equalsIgnoreCase("iya")) {
                        hargaAkhir = 0;
                        potongan = total;
                    } else {
                        hargaAkhir = total;
                        potongan = 0;
                    }
                    headerStruct();
                    structPoliKulitDanKelamin(pasien, nomor, bpjs, poliklinik, poli, poliKulitDanKelamin,
                            jenisPerawatan, total, potongan, hargaAkhir, p, hargaAwal, dokter, pembayaran, kembalian);
                } else {
                    System.out.println("/-----Anda Salah Memasukkan Nomor,Silahkan Memasukkan Lagi------/");
                    System.out.println();
                }
            } while (poli > 6 || poli < 1);
            System.out.println();
            System.out.print("Apakah anda ingin membuat struct lagi [iya/tidak] : ");
            tambahStruct = sc.next();
            System.out.println();
            total = 0;
        }

    }
}

package com.pbo;

import java.util.*;

class Orang{
    private int _umur;
    private String _nama;
    private String golDarah;

    //Method
    public void setUmur(int umur){
        this._umur = umur;
    }
    public void setNama(String nama){
        this._nama = nama;
    }
    public void setGolDarah(String golDarah){
        this.golDarah = golDarah;
    }
    public int getUmur (){
        return this._umur;
    }
    public String getGolDarah (){
        return golDarah;
    }
    public String getNama (){
        return this._nama   ;
    }


}

class Pegawai extends Orang {
    String nip;
    String jabatan;
    int golongan;
    int jamKerja;


    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    void gaji() {
        int gajipokok = 0;
        int tunjangan = 0;
        int gajilembur;
        int totalgaji;
        int lembur;

        if (golongan == 1) {
            gajipokok = 1486500;
            tunjangan = 300000;
        }
        if (golongan == 2) {
            gajipokok = 1926000;
            tunjangan = 300000;
        }
        if (golongan == 3) {
            gajipokok = 2456700;
            tunjangan = 350000;
        }
        if (golongan == 4) {
            gajipokok = 2899500;
            tunjangan = 400000;
        }
        if (jamKerja <= 172) {
            lembur = 0;
            System.out.println("Maaf anda tidak mendapat uang lembur");
            System.out.println("=====================================");
        }
        else {
            lembur = jamKerja - 173;
        }
        gajilembur = lembur * 20000;
        System.out.println("\tGaji Pokok Anda  = Rp.  " + gajipokok);
        System.out.println("\tTunjangan Anda   = Rp.  " + tunjangan);
        System.out.println("\tGaji Lembur Anda = Rp.  " + gajilembur);
        totalgaji = gajipokok + tunjangan + gajilembur;
        System.out.println("=====================================");
        System.out.println("Total Gaji Anda adalah = RP.   " + totalgaji);
        System.out.println("=====================================");

    }
}

public class TugasGaji {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai peg = new Pegawai();

        int jamKerja;
        int umur;
        int golongan;
        String nama;
        String golonganDarah;
        String nip;
        String jabatan;

        System.out.println("SILAHLAN MASUKKAN BIODATA ANDA");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("NIP : ");
        nip = input.nextLine();
        System.out.print("Golongan Darah : ");
        golonganDarah = input.nextLine();
        System.out.print("Jabatan : ");
        jabatan = input.nextLine();
        System.out.print("Umur : ");
        umur = input.nextInt();
        System.out.print("Jam kerja : ");
        jamKerja = input.nextInt();
        System.out.print("Golongan Pekerja : ");
        golongan = input.nextInt();
        System.out.println("========================");
        System.out.println("\t BIODATA ");
        System.out.println("========================");


        peg.setNama(nama);
        peg.setNip(nip);
        peg.setUmur(umur);
        peg.setGolDarah(golonganDarah);
        peg.setJabatan(jabatan);
        peg.setJamKerja(jamKerja);
        peg.setGolongan(golongan);

        System.out.println("Nama : " + peg.getNama());
        System.out.println("NIP : " + peg.getNip());
        System.out.println("Golongan Darah : " + peg.getGolDarah());
        System.out.println("Jabatan : " + peg.getJabatan());
        System.out.println("Umur : " + peg.getUmur());
        System.out.println("Jam Kerja : " + peg.getJamKerja());
        System.out.println("Golongan : " + peg.getGolongan());
        System.out.println("\n");
        System.out.println("=====================================");
        System.out.println("\t ||| GOLONGAN KE- " + golongan + "|||");
        System.out.println("=====================================");
        peg.gaji();

    }

}

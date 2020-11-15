package com.pbo;

interface TugasMhs{
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

interface TugasMhs2{
    void Kuliah();
    void BelajarMandiri();
    void MengembangkanDiri();
}

class Mhs implements TugasMhs,TugasMhs2{
    public Mhs(){
        System.out.println("Tugas Mahasiswa adalah ");
    }

    @Override
    public void Kuliah() {
        System.out.println("1. Kuliah Tepat Waktu");
    }

    @Override
    public void BelajarMandiri() {
        System.out.println("2. Belajar Mandiri, rajin membaca");
    }

    @Override
    public void MengembangkanDiri() {
        System.out.println("3. Mengembangkan Diri Sendiri Melalui Pelatihan dari Komunitas");
    }
}

public class mahasiswa {
    public static void main(String[] args){
        Mhs x = new Mhs();


        x.Kuliah();
        x.BelajarMandiri();
        x.MengembangkanDiri();
    }

}
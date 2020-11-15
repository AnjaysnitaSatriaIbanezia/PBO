package com.pbo;

// Interface
interface Mamalia {
    // Interface Method
    public void tempatTinggal();
    public void tidur();
}

interface MakhlukHidup {
    public void bernafas();
    public void bernama();
}

class Hewan1 implements Mamalia, MakhlukHidup {
    @Override
    public void tempatTinggal() {
        System.out.println("Tempat Tinggal: Air");
    }

    @Override
    public void tidur() {
        System.out.println("Zzz...");
    }

    @Override
    public void bernafas() {
        System.out.println("Paru-paru");
    }

    @Override
    public void bernama() {
        System.out.println("Paus");
    }
}

public class main_2 {
    public static void main(String[] args) {
        Hewan1 paus = new Hewan1();
        paus.bernama();
        paus.bernafas();
        paus.tempatTinggal();
        paus.tidur();
    }
}
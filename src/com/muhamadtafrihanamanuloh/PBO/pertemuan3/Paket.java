package com.muhamadtafrihanamanuloh.PBO.pertemuan3;

public class Paket {
    public static void main(String[] args) {
        PaketModemOrbit orbitextra = new PaketModemOrbit();
        PaketModemOrbit orbitdeals = new PaketModemOrbit();
        PaketModemOrbit internetmalam = new PaketModemOrbit();

        orbitextra.paket = "orbit extra";
        orbitextra.benefit = "90 gb / 30 days";
        orbitextra.harga = 150000;

        orbitdeals.paket = "orbit deals";
        orbitdeals.benefit = "70GB/30 Days";
        orbitdeals.harga = 131000;

        internetmalam.paket = "internet malam";
        internetmalam.benefit = "15GB/31 Days";
        internetmalam.harga = 40000;

        //untuk menjalankan method
        orbitextra.showInfo();
        orbitdeals.showInfo();
        internetmalam.showInfo();
    }
}

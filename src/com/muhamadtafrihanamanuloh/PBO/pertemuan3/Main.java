package com.muhamadtafrihanamanuloh.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //Pembuatan class
        SepedaMotor honda = new SepedaMotor("Honda", "vario 160", 35000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha","Nmax", 40000000 );
        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa matic", 60000000);

/*
        //Mengisi nilai atribut objek honda

        honda.merk = "Honda";
        honda.tipe = "Vario 160";
        honda.harga = 35000000 ;

        yamaha.merk = "Yamaha";
        yamaha.tipe = "Nmax";
        yamaha.harga = 40000000;

        vespa.merk = "Vespa";
        vespa.tipe = "vespa matic";
        vespa.harga = 60000000;
*/
        //untuk menjalankan method
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        // uji coba getter dan setter
        System.out.println(" Motor merk "+ honda.getMerk()+ " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println(" Motor merk "+ honda.getMerk()+ " dengan tipe (sesudah) : " + honda.getTipe());
    }
}

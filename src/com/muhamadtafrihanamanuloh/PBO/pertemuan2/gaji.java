package com.muhamadtafrihanamanuloh.PBO.pertemuan2;

import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan nama Anda :");
        String nama = input.nextLine();
        System.out.println("gaji yang diterima oleh "+ nama +" adalah sebagai berikut");
        System.out.println("Masukkan gaji Anda :");
        double gaji = input.nextInt();
        System.out.println("Masukkan tunjangan Anda :");
        double tunjangan = input.nextInt();
        double pajak = 7.65/100;

        double gaji_kotor = gaji + tunjangan;
        System.out.println("gaji_kotor = gaji + tunjangan = "+ gaji +" + "+ tunjangan + " = " + gaji_kotor);
        double pajak_negara = gaji_kotor * pajak;
        System.out.println("pajak_negara = gaji_kotor * pajak = "+ gaji_kotor +" * "+ pajak + " = " + pajak_negara);
        double gaji_bersih = gaji_kotor - pajak_negara;
        System.out.println("gaji_bersih = gaji_kotor - pajak_negara = "+ gaji_kotor +" - "+ pajak_negara + " = " + gaji_bersih);
        System.out.println("Total gaji bersih dari "+ nama +" yang diterima yaitu = "+ gaji_bersih );
    }
}

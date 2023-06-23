package com.muhamadtafrihanamanuloh.PBO.pertemuan4;

public class Manajer extends Pegawai{
    public void bonus(int bonus){

        System.out.println("Pegawai dengan nama "+nama+"("+nip+") mendapat bonus sebesar Rp"+bonus);
    }
    public void extrInfo() {
        System.out.println("Jabatan Pegawai : Manager");
    }
    public void bonus(){
        System.out.println("Error : harap masukkan jumlah bonusnya!");
    }
}
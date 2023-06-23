package com.muhamadtafrihanamanuloh.PBO.pertemuan4;

public class hero {
    protected String namaHero;
    protected int hpHero;
    protected int powerHero;
    protected int movementSpeed;
    public hero(){}
    public void tampilInfoHero(){
        System.out.println("Nama Hero : " + namaHero);
        System.out.println("Nyawa Hero : " + hpHero);
        System.out.println("Kekuatan Hero : " + powerHero);
        System.out.println("Kecepatan Bergerak : " + movementSpeed);
        System.out.println();
    }
    public void move(){
        System.out.println(" Klik bergerak ");
    }
    public void attack(){
        System.out.println(" Klik Serang ");
    }
}
/*
# int hp
# string nama
# int power
# int movementspeed
+ move(): void
+ attack(): void
*/
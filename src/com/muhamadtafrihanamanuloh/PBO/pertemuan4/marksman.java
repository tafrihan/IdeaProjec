package com.muhamadtafrihanamanuloh.PBO.pertemuan4;

public class marksman extends hero {
    private int physicaldamage;
    public marksman(String nama, int hp, int power, int movement, int physDmg){
        this.namaHero = nama;
        this.hpHero = hp;
        this.powerHero = power;
        this.movementSpeed = movement;
        this.physicaldamage = physDmg;
    }
    public int getPhy(){
        return physicaldamage;
    }
    public void tembak(){
        System.out.println(" Klik Tembak");
    }
    public void menampilkan(){
        System.out.println();
        System.out.println("nama mm : " + namaHero );
        System.out.println("HP mm : " + hpHero);
        System.out.println("power mm : " + powerHero);
        System.out.println("Movement mm : " + movementSpeed);
        System.out.println("Physical Damage mm : " + getPhy());
        System.out.println();
        }

}
/*
- int physicaldamage
+ tembak(): void
*/
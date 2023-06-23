package com.muhamadtafrihanamanuloh.PBO.pertemuan4;

public class tank extends hero{
    private int physicalDefense;
    public tank(String nama, int hp, int power, int movement, int physDfn){
        this.namaHero = nama;
        this.hpHero = hp;
        this.powerHero = power;
        this.movementSpeed = movement;
        this.physicalDefense = physDfn;
    }
    public int getDfn(){
        return physicalDefense;
    }
    public void stunt(){
        System.out.println(" Stunt hero");
    }
    public void menampilkan(){
        System.out.println();
        System.out.println("nama tank : " + namaHero );
        System.out.println("HP tank : " + hpHero);
        System.out.println("power tank : " + powerHero);
        System.out.println("Movement tank : " + movementSpeed);
        System.out.println("Physical Defense tank : " + getDfn());
        System.out.println();
    }
}

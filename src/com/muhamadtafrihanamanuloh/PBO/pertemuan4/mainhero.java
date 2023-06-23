package com.muhamadtafrihanamanuloh.PBO.pertemuan4;

public class mainhero {
    public static void main(String[] args) {
    marksman marksman1 = new marksman( "Layla", 2010, 940, 40, 350);
    tank tank1 = new tank("Johnson", 4500, 120, 45, 700);
    marksman1.menampilkan();
    marksman1.tembak();
    marksman1.move();
    marksman1.attack();
    tank1.menampilkan();
    tank1.stunt();
    tank1.move();
    tank1.attack();
    }
}

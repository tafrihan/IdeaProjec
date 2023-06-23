package com.muhamadtafrihanamanuloh.PBO.pertemuan6;

public class tryCatch {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        try {
            System.out.println(angka[6]);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: ");
        }
        System.out.println("Proses selesai ");
    }
}

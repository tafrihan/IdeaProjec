package com.muhamadtafrihanamanuloh.PBO.pertemuan6;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            // Kode yang berpotensi menghasilkan exception
        } catch (ArithmeticException e) {
            // Penanganan exception untuk IOException dan SQLException
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Penanganan exception untuk NumberFormatException
            System.out.println("Format angka tidak valid");
        }
    }
}

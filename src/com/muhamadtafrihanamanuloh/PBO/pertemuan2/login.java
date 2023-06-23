package com.muhamadtafrihanamanuloh.PBO.pertemuan2;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String nama, password;
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan nama Anda :");
        nama = input.nextLine();
        System.out.println("Masukkan password Anda :");
        password = input.nextLine();
        System.out.println("Selamat pagi " + nama + "!");
        System.out.println("Password anda " + password + "!");
        if (nama.equals("Tafrihan") && password.equals("taf123") ){
            System.out.println("Anda berhasil masuk");
        }else{
            System.out.println("Username dan password anda salah");
        }
    }
}

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //menus
        System.out.println("Baju yang tersedia");
        System.out.println("Baju A \t: 100_000");
        System.out.println("Baju B \t: 125_000");
        System.out.println("Baju C \t: 175_000");

        //inputs
        System.out.print("Baju tipe yang dipilih  : ");
        String tipe = in.next();
        in.nextLine();
        System.out.print("jumlah yang akan dibeli : ");
        int jumlah = in.nextInt();

        //construct and display
        Baju baju = new Baju(tipe, jumlah);
        baju.layar();
    }
}

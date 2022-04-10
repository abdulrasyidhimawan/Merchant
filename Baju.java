package com.company;

public class Baju {

    //attrib or fields
    private String tipe;
    private int jumlah;
    private int harga;

    // konstruktor utama
    public Baju(String tipe, int jumlah){
        this.tipe = tipe;
        this.jumlah = jumlah;
    }

    // fixed data
    final int bA = 100_000;
    final int bB = 125_000;
    final int bC = 175_000;

    // proses jika beli > 100
    void hargaA () {
        if(jumlah > 100){
            harga = 95_000;
        }
        else{
            harga = bA ;
        }
    }


    void hargaB () {
        if(jumlah > 100) {
            harga = 120_000 ;
        }
        else {
            harga = bB ;
        }
    }
    void hargaC (){
        if(jumlah > 100){
            harga = 160_000;
        } else{
            harga = bC;
        }
    }

    // tampilan di mainclass
    void layar () {
        if (tipe.equalsIgnoreCase("a")){
            hargaA();
        }else if (tipe.equalsIgnoreCase("b")){
            hargaB();
        }else if(tipe.equalsIgnoreCase("c")){
            hargaC();
        }
        System.out.println("----------------------------------------");
        System.out.println("Jenis yang anda Beli : "+ tipe );
        System.out.println("Harga perbuah        : "+ harga);
        System.out.println("Total                : "+ harga * jumlah);
        System.out.println("----------------------------------------");
    }
}

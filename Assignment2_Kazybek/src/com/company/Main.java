package com.company;

public class Main {

    public static void main(String[] args) {
        Voenkomat esilskogoRaiona = new Voenkomat();

        Prizyvnik p1 = new Prizyvnik("Adilzhan");
        Prizyvnik p2 = new Prizyvnik("Asylzhan");
        Prizyvnik p3 = new Prizyvnik("Akezhan");
        Prizyvnik p4 = new Prizyvnik("Birzhan");
        Prizyvnik p5 = new Prizyvnik("Tleuzhan");

        esilskogoRaiona.dobavitBednogo(p1);
        esilskogoRaiona.dobavitBednogo(p2);
        esilskogoRaiona.dobavitBednogo(p3);
        esilskogoRaiona.dobavitBednogo(p4);
        esilskogoRaiona.dobavitBednogo(p5);

        esilskogoRaiona.upload("Xexe))");
    }
}

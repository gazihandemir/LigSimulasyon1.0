package com.gazihan;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
    FutbolOyuncusu futbolcu1 = new FutbolOyuncusu("alex");
    FutbolOyuncusu futbolcu2 = new FutbolOyuncusu("drogba");
    FutbolOyuncusu futbolcu3 = new FutbolOyuncusu("gökhan");
    FutbolOyuncusu futbolcu4 = new FutbolOyuncusu("dursun");


    BasketbolOyuncusu basketci1 = new BasketbolOyuncusu("lebron");
    BasketbolOyuncusu basketci2 = new BasketbolOyuncusu("gazihan");

    Takim<FutbolOyuncusu> galatasaray = new Takim("Galatasaray Futbol Takimi");
    Takim<FutbolOyuncusu> fenerbahce = new Takim("Fenerbahçe Futbol Takimi");
    Takim<FutbolOyuncusu> besiktas = new Takim("Beşiktaş Futbol Takimi");
    Takim<FutbolOyuncusu> trabzonSpor = new Takim("Trabzon Spor Futbol Takimi");

    Takim<BasketbolOyuncusu> anadoluEfes = new Takim("Anadolu Efes Basketbol Takimi");
    Takim<BasketbolOyuncusu> pinarKarsiyaka = new Takim("Pinar Karsiyaka Basketbol Takimi");

    fenerbahce.oyuncuEkle(futbolcu1);
    galatasaray.oyuncuEkle(futbolcu2);
    besiktas.oyuncuEkle(futbolcu3);
    trabzonSpor.oyuncuEkle(futbolcu4);
    anadoluEfes.oyuncuEkle(basketci1);
    pinarKarsiyaka.oyuncuEkle(basketci2);

    fenerbahce.macYap(galatasaray,3,2);
    fenerbahce.macYap(besiktas,2,2);
    fenerbahce.macYap(trabzonSpor,3,4);
    galatasaray.macYap(fenerbahce,2,2);
    galatasaray.macYap(besiktas,0,0);
    galatasaray.macYap(trabzonSpor,5,0);
    besiktas.macYap(fenerbahce,0,0);
    besiktas.macYap(galatasaray,4,2);
    besiktas.macYap(trabzonSpor,0,2);
    trabzonSpor.macYap(fenerbahce,0,10);
    trabzonSpor.macYap(galatasaray,3,2);
    trabzonSpor.macYap(besiktas,2,2);

        System.out.println("FenerBahce Puani : "+fenerbahce.takimPuani());
        System.out.println("Galatasaray Puani : "+galatasaray.takimPuani());
        System.out.println("Besiktas puani : "+besiktas.takimPuani());
        System.out.println("Trabzon spor puani : "+trabzonSpor.takimPuani());
        Lig<Takim<FutbolOyuncusu>> futbolTakimlari = new Lig("süper lig ");
        futbolTakimlari.takimEkle(fenerbahce);
        futbolTakimlari.takimEkle(galatasaray);
        futbolTakimlari.takimEkle(besiktas);
        futbolTakimlari.takimEkle(trabzonSpor);
        System.out.println("\n PUAN TABLOSU SIRALAMASI \n ");
        futbolTakimlari.puanTablosu();

    }
}

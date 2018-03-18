package com.gazihan;

import java.util.ArrayList;
import java.util.Collections;


public class Lig<T extends Takim> {
    private String isim;
    private ArrayList<T> tümTakimlar = new ArrayList<T>();
    public Lig(String isim){
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public boolean takimEkle(T yeniTakimlar){
        if(yeniTakimlar.equals(isim)){
            System.out.println("eklediginiz takim eklenemez(takim zaten var");
            return false;
        }
        tümTakimlar.add(yeniTakimlar);

        return true;
    }
    public void puanTablosu(){
        Collections.sort(tümTakimlar,Collections.<T>reverseOrder());
        for(T gecici : tümTakimlar){
            System.out.println(gecici.getTakimİsmi() + " "+gecici.takimPuani());
        }
        }
    }



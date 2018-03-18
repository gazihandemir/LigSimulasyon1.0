package com.gazihan;

public abstract class Oyuncu {

    private String isim;
    public Oyuncu(String isim){
        this.isim = isim;
    }
    public String getİsim(){
        return this.isim;
    }
}

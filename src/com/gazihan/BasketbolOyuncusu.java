package com.gazihan;

public class BasketbolOyuncusu extends Oyuncu{
    private String isim;
    public BasketbolOyuncusu(String isim) {
        super(isim);
    }
    public String getIsim(){
        return this.isim;
    }
}

package com.gazihan;

import java.util.ArrayList;

public class Takim<T extends Oyuncu> implements Comparable<Takim<T>> {
    private String takimİsmi;
    private int oynananMacSayisi =0;
    private int kazanilanMacSayisi=0;
    private int kaybedilenMacSayisi=0;
    private int beraberlikMacSayisi=0;
    private ArrayList <T> oyuncular = new ArrayList<T>();
    public Takim(String takimİsmi){
        this.takimİsmi = takimİsmi;
    }
    public String getTakimİsmi(){
        return this.takimİsmi;
    }
    public boolean oyuncuEkle(T yeniOyuncu){
        if(oyuncular.contains(yeniOyuncu)){
            System.out.println(yeniOyuncu.getİsim()+" isimli oyuncu takimda bulunuyor ");
            return false;
        }else{
            oyuncular.add(yeniOyuncu);
            System.out.println(yeniOyuncu.getİsim()+" isimli oyuncu takima eklendi ");
            return true;
        }
    }
    public int toplamOyuncuSayisi(){
        return oyuncular.size();
    }
    public void macYap(Takim<T> rakipTakim,int takimSkor,int rakipSkor){
        String mesaj = " ";
        if(takimSkor > rakipSkor){
            mesaj = " kazandi";
            kazanilanMacSayisi++;
        }
        else if (takimSkor < rakipSkor){
            mesaj = "kaybetti ";
            kaybedilenMacSayisi++;
        }else{
            mesaj= " berabere kaldi ";
            beraberlikMacSayisi++;
        }
        oynananMacSayisi++;
        if(rakipTakim != null){
            System.out.println(this.getTakimİsmi()+" "+ mesaj+" "+rakipTakim.getTakimİsmi()+" ile \n ");
            rakipTakim.macYap(null,rakipSkor,takimSkor);
        }
    }
    public int takimPuani(){
    return (kazanilanMacSayisi*3)+beraberlikMacSayisi;
    }


    @Override
    public int compareTo(Takim<T> o) {
        if(this.takimPuani() > o.takimPuani()){
            return 1;
        }
        else if(this.takimPuani() < o.takimPuani()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

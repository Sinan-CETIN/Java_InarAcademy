package weeks.week_13;

import netscape.security.UserTarget;

public class Home {
    private int yuzOlcumu;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajVarMi;
    private int ucret;
    private int kira;
    private String cephe;
    private int yil;

    public Home() {
        this(100, 2, 4, true, 1_000_000, 3000, "Deniz Manzarasi", 2010);
    }

    public Home (int yuzOlcumu, int banyoSayisi, int odaSayisi, boolean garajVarMi, int ucret, int kira, String cephe, int yil) {
        this.yuzOlcumu = yuzOlcumu;
        this.banyoSayisi = banyoSayisi;
        this.odaSayisi = odaSayisi;
        this.garajVarMi = garajVarMi;
        this.ucret = ucret;
        this.kira = kira;
        this.cephe = cephe;
        this.yil = yil;
    }

    public int getBanyoSayisi() {
        return this.banyoSayisi;
    }

    public int getKira() {
        return this.kira;
    }

    public int getOdaSayisi() {
        return this.odaSayisi;
    }

    public int getUcret() {
        return this.ucret;
    }

    public int getYil() {
        return this.yil;
    }

    public boolean getGarajVarMi() {
        return this.garajVarMi;
    }

    public int getYuzOlcumu() {
        return this.yuzOlcumu;
    }


    public String getCephe() {
        return this.cephe;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void setYuzOlcumu(int yuzOlcumu) {
        this.yuzOlcumu = yuzOlcumu;
    }
    public void print() {
        System.out.println("--------------------HOME DETAILS--------------------");
        System.out.println("Yuz Olcumu --> " + this.getYuzOlcumu() + "m^2" +
        "\nBanyo Sayisi --> " + this.getBanyoSayisi() +
                "\nOda sayisi --> " + this.getOdaSayisi() +
                "\nGaraj var mi? --> " + (this.getGarajVarMi() ? "var" : "yok") +
                "\nSatin alma ucreti --> " + getUcret() + "$" +
                "\nKira --> " + getKira() + "$" +
                "\nCephe --> " + getCephe() +
                "\nYapim yili --> " + getYil());
        System.out.println("-----------------------------------------------------");
    }
}

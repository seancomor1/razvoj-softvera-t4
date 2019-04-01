package sample;

import java.util.ArrayList;

public class Artikal  {
    private String sifra;
    private String naziv;
    private double cijena;


    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public artikal(String sifra, String naziv, double cijena) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cijena = cijena;
    }
    public artikal(String podatak) {
        String [] artikal = podatak.split(",");
        this.sifra = artikal[0];
        this.naziv = artikal[1];
        this.cijena = Double.parseDouble(artikal[2]);
    }
    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    @Override
    public String toString() {
        String izlaz=this.sifra + "," + naziv "," + cijena;
        return izlaz;

    }
    public boolean equals(Object o) {
        Artikal a = (Artikal) o;
        if(this == o) return true;
        if(!naziv.equals(a.getNaziv())) return false;
        if(!sifra.equals(a.getSifra())) return false;
        if(Double.compare(cijena, a.getCijena())!=0) return false;
        return true;

    }
    public static ArrayList<Artikal> izbaciDuplikate(ArrayList<Artikal> artikli) {
        for(int i = 0; i < artikli.size(); i++) {
            for(int j = 0; i+j)
        }


    }

}


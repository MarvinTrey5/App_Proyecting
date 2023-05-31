package com.example.appproyecting;

public class ProductosPlanilla {
    int VerFoto;
    String nom;
    String prec;
    String cant;
    String val;
    String des;

    public ProductosPlanilla(int verFoto, String nom, String prec,
                             String cant, String val, String des) {
        VerFoto = verFoto;
        this.nom = nom;
        this.prec = prec;
        this.cant = cant;
        this.val = val;
        this.des = des;
    }

    public int getVerFoto() {
        return VerFoto;
    }

    public void setVerFoto(int verFoto) {
        VerFoto = verFoto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrec() {
        return prec;
    }

    public void setPrec(String prec) {
        this.prec = prec;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

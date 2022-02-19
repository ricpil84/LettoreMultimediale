package com.thenetvalue.superclassi;

public abstract class ElementoMultimediale {
    private String titolo;

    public ElementoMultimediale(String titolo) {
        if(titolo!=null) {
            this.titolo = titolo;
        }
        else
            throw new IllegalArgumentException("Nome file vuoto");
    }
    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}

package com.thenetvalue;

import com.thenetvalue.superclassi.ElementoMultimediale;
import com.thenetvalue.superclassi.Visualizzabile;
import com.thenetvalue.estensioni.TipoImmagine;

public class Immagine extends ElementoMultimediale implements Visualizzabile {
    TipoImmagine formato;
    private int luminosita;

    public Immagine(String titolo, TipoImmagine formato, int luminosita) {
        super(titolo);
        this.formato=formato;
        this.luminosita=luminosita;
    }

    public TipoImmagine getFormato() {
        return formato;
    }
    public void setFormato(TipoImmagine formato) {
        this.formato = formato;
    }
    public int getLuminosita() {
        return luminosita;
    }
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void brighter() {
        if(luminosita < LUMINOSITA_MAX){
            setLuminosita(this.luminosita+1);
        }
        else
            setLuminosita(LUMINOSITA_MAX);
    }
    public void darker(){
        if(luminosita > SCREEN_OFF){
            setLuminosita(this.luminosita-1);
        }
        else
            setLuminosita(SCREEN_OFF);
    }

    public void show(){
        System.out.println("...Esecuzione in corso...");
        System.out.printf("%s", super.getTitolo());
        stampaLuminosita(getLuminosita());
        System.out.println();
    }
}

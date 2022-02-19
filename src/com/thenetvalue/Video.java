package com.thenetvalue;

import com.thenetvalue.superclassi.*;
import com.thenetvalue.estensioni.TipoVideo;

public class Video extends ElementoRiproducibile implements Riproducibile, Visualizzabile {
    private TipoVideo formato;
    private int luminosita;

    public Video(String titolo, TipoVideo formato, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.formato=formato;
        this.luminosita=luminosita;
    }

    public TipoVideo getFormato() {
        return formato;
    }
    public void setFormato(TipoVideo formato) {
        this.formato = formato;
    }
    public int getLuminosita() {
        return luminosita;
    }
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void play() {
        System.out.println("...Esecuzione in corso...");
        for(int j=0;j<super.getDurata();j++) {
            System.out.printf("%s", super.getTitolo());
            stampaVolume(super.getVolume());
            stampaLuminosita(getLuminosita());
            System.out.println();
        }
    }

    @Override
    public void brighter() {

    }

    @Override
    public void darker() {

    }
}

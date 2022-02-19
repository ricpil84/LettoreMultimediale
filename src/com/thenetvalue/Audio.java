package com.thenetvalue;

import com.thenetvalue.superclassi.ElementoRiproducibile;
import com.thenetvalue.estensioni.TipoAudio;

public class Audio extends ElementoRiproducibile {
    private TipoAudio formato;

    public Audio(String titolo, TipoAudio formato, int durata, int volume) {
        super(titolo, durata, volume);
        this.formato=formato;
    }
    public TipoAudio getFormato() {
        return formato;
    }
    public void setFormato(TipoAudio formato) {
        this.formato = formato;
    }
    @Override
    public void play() {
        System.out.println("...Esecuzione in corso...");
        for(int j=0;j<super.getDurata();j++) {
            System.out.printf("%s", super.getTitolo());
            stampaVolume(super.getVolume());
            System.out.println();
        }
    }
}

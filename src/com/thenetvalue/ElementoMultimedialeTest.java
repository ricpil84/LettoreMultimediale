package com.thenetvalue;

import com.thenetvalue.superclassi.ElementoMultimediale;
import com.thenetvalue.superclassi.ElementoRiproducibile;
import com.thenetvalue.estensioni.*;

public class ElementoMultimedialeTest {
    public static void main(String[] args) {
        ElementoMultimediale arrayMultimediale[] = {
                new Immagine("Guernica", TipoImmagine.JPG, 10),
                new Audio("Aenima", TipoAudio.AAC, 3, 0),
                new Video("Matrix", TipoVideo.AVI, 3, 3, 0),
                new Video("Titanic", TipoVideo.FLV, 3, 10, 1),
                new Audio("Nazi Punks Fuckoff", TipoAudio.MP3, 3, 10),
                new Immagine("Gioconda", TipoImmagine.PNG, 0),
                new Immagine("Girasoli", TipoImmagine.TIFF, 10),
                new Audio("1984", TipoAudio.WAV, 3, 0),
                new Video("Blow", TipoVideo.WEBM, 3, 0, 10),
                new Audio("Bombtrack", TipoAudio.MIDI, 2, 2)
        };

        for(ElementoMultimediale elemento : arrayMultimediale){
            if(elemento instanceof Immagine){
                Immagine immagine = (Immagine) elemento;
                immagine.show();
            }
            else{
                ElementoRiproducibile riproducibile = (ElementoRiproducibile) elemento;
                riproducibile.play();
            }
        }

        Immagine provaLuminositaImmagine = (Immagine) arrayMultimediale[0];
        provaLuminositaImmagine.brighter();
        System.out.println(provaLuminositaImmagine.getLuminosita());

        Audio provaVolumeAudio = (Audio) arrayMultimediale[1];
        provaVolumeAudio.weaker();
        System.out.println(provaVolumeAudio.getVolume());

        Video provaLuminositaVideo = (Video) arrayMultimediale[2];
        provaLuminositaVideo.brighter();
        System.out.println(provaLuminositaVideo.getLuminosita());

        Video provaVolumeVideo = (Video) arrayMultimediale[3];
        provaVolumeVideo.louder();
        System.out.println(provaVolumeVideo.getVolume());
    }
}

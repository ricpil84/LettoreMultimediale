package com.thenetvalue.superclassi;

public abstract class ElementoRiproducibile extends ElementoMultimediale implements Riproducibile{
    private int durata;
    private int volume;

    public ElementoRiproducibile(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return this.durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume=volume;
    }

    public abstract void play();

    @Override
    public void weaker(){
        if(getVolume() > MUTE) {
            setVolume(getVolume()-1);
        }
        else
            setVolume(MUTE);
    };
    @Override
    public void louder(){
        if(getVolume() < VOLUME_MAX) {
            setVolume(getVolume()+1);
        }
        else
            setVolume(VOLUME_MAX);
    };
}

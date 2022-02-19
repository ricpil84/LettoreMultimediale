package com.thenetvalue.superclassi;

public interface Riproducibile{
    public final static int VOLUME_MAX = 10;
    public final static int MUTE = 0;

    public void weaker();
    public void louder();

    public default void stampaVolume(int volume) {
        for (int i = 0; i < volume; i++) {
            System.out.printf("!");
        }
    }
}

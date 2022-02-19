package com.thenetvalue.superclassi;

public interface Visualizzabile {
    public final static int LUMINOSITA_MAX = 10;
    public final static int SCREEN_OFF = 0;

    public void brighter();
    public void darker();
    public default void stampaLuminosita(int luminosita) {
        for (int i = 0; i < luminosita; i++) {
            System.out.printf("*");
        }
    }
}

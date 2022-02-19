package com.thenetvalue.estensioni;

public enum TipoAudio {
    MP3(".mp3"), MIDI(".midi"), WAV(".wav"), AAC(".aac");

    private String estensione;

    TipoAudio(String estensione) {
        this.estensione=estensione;
    }

    public String getEstensione(){
        return estensione;
    }
}

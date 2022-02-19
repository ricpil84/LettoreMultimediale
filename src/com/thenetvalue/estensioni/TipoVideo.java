package com.thenetvalue.estensioni;

public enum TipoVideo {
    MP4(".mp4"), WEBM(".webm"), AVI(".avi"), FLV(".flv");

    private String estensione;

    TipoVideo(String estensione) {
        this.estensione=estensione;
    }

    public String getEstensione(){
        return estensione;
    }
}

package com.thenetvalue.estensioni;

public enum TipoImmagine {
    JPG(".jpg"), PNG(".png"), JPEG(".jpeg"), TIFF(".tiff");

    private String estensione;

    TipoImmagine(String estensione) {
        this.estensione=estensione;
    }

    public String getEstensione(){
        return estensione;
    }
}

package com.mac.fireflies.wgt.eventbus;

/**
 * Created by User on 12/26/2016.
 */

public class StringEvent {
    private String texto;

    public StringEvent(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}

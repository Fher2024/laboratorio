package com.laboratorio;

public class Moto {

    private String modelo;
    private String serial;
    private String placa;

    public Moto(String modelo, String serial, String placa) {
        this.modelo = modelo;
        this.serial = serial;
        this.placa = placa;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public String getserial() {
        return serial;
    }

    public void setserial(String serial) {
        this.serial = serial;
    }

    public String getplaca() {
        return placa;
    }

    public void setplaca(String placa) {
        this.placa = placa;
    }

}

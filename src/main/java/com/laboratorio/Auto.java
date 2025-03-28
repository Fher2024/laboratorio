package com.laboratorio;

public class Auto {
    private int numeroPasajeros;
    private int numeroPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numeroBolsasAire;
    private boolean frenosAbs;
    private boolean sensoresColision;
    private String color;
    public Auto(int numeroPasajeros, int numeroPuertas, int capacidadMaletero, boolean aireAcondicionado,
            boolean camaraReversa, int numeroBolsasAire, boolean frenosAbs, boolean sensoresColision, String color) {
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.frenosAbs = frenosAbs;
        this.sensoresColision = sensoresColision;
        this.color = color;
    }
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isCamaraReversa() {
        return camaraReversa;
    }
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }
    public boolean isFrenosAbs() {
        return frenosAbs;
    }
    public void setFrenosAbs(boolean frenosAbs) {
        this.frenosAbs = frenosAbs;
    }
    public boolean isSensoresColision() {
        return sensoresColision;
    }
    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Auto [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", numeroBolsasAire=" + numeroBolsasAire + ", frenosAbs=" + frenosAbs + ", sensoresColision="
                + sensoresColision + ", color=" + color + "]";
    }
    
}

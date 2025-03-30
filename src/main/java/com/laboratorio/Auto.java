package com.laboratorio;

/**
 * Representa un automóvil con diversas características y especificaciones.
 */
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

    /**
     * Constructor para inicializar un objeto Auto con sus características.
     * 
     * @param numeroPasajeros   Número de pasajeros que puede transportar el auto.
     * @param numeroPuertas     Número de puertas del auto.
     * @param capacidadMaletero Capacidad del maletero en litros.
     * @param aireAcondicionado Indica si el auto tiene aire acondicionado.
     * @param camaraReversa     Indica si el auto tiene cámara de reversa.
     * @param numeroBolsasAire  Número de bolsas de aire disponibles en el auto.
     * @param frenosAbs         Indica si el auto tiene sistema de frenos ABS.
     * @param sensoresColision  Indica si el auto tiene sensores de colisión.
     * @param color             Color del auto.
     */
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

    /** @return Número de pasajeros del auto. */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /** @param numeroPasajeros Número de pasajeros a establecer. */
    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    /** @return Número de puertas del auto. */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /** @param numeroPuertas Número de puertas a establecer. */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    /** @return Capacidad del maletero en litros. */
    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /** @param capacidadMaletero Capacidad del maletero a establecer. */
    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /** @return {@code true} si el auto tiene aire acondicionado, de lo contrario {@code false}. */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /** @param aireAcondicionado Define si el auto tiene aire acondicionado. */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /** @return {@code true} si el auto tiene cámara de reversa, de lo contrario {@code false}. */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /** @param camaraReversa Define si el auto tiene cámara de reversa. */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    /** @return Número de bolsas de aire del auto. */
    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    /** @param numeroBolsasAire Número de bolsas de aire a establecer. */
    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    /** @return {@code true} si el auto tiene frenos ABS, de lo contrario {@code false}. */
    public boolean isFrenosAbs() {
        return frenosAbs;
    }

    /** @param frenosAbs Define si el auto tiene frenos ABS. */
    public void setFrenosAbs(boolean frenosAbs) {
        this.frenosAbs = frenosAbs;
    }

    /** @return {@code true} si el auto tiene sensores de colisión, de lo contrario {@code false}. */
    public boolean isSensoresColision() {
        return sensoresColision;
    }

    /** @param sensoresColision Define si el auto tiene sensores de colisión. */
    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    /** @return Color del auto. */
    public String getColor() {
        return color;
    }

    /** @param color Color del auto a establecer. */
    public void setColor(String color) {
        this.color = color;
    }


     /**
     * Calcula la seguridad del auto basada en el número de bolsas de aire y sensores de colisión.
     * 
     * @return Nivel de seguridad en una escala de 1 a 10.
     */
    public int calcularNivelSeguridad() {
        int nivelSeguridad = numeroBolsasAire * 2;
        if (sensoresColision) {
            nivelSeguridad += 3;
        }
        return Math.min(nivelSeguridad, 10);
    }

    /**
     * Verifica si el auto es considerado de lujo basado en ciertas características.
     * 
     * @return {@code true} si el auto es de lujo, de lo contrario {@code false}.
     */
    public boolean esDeLujo() {
        return aireAcondicionado && camaraReversa && frenosAbs && sensoresColision && numeroBolsasAire >= 4;
    }


    /**
     * Devuelve una representación en cadena de los atributos del auto.
     * 
     * @return Cadena con los detalles del auto.
     */
    @Override
    public String toString() {
        return "Auto [numeroPasajeros=" + numeroPasajeros + ", numeroPuertas=" + numeroPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", numeroBolsasAire=" + numeroBolsasAire + ", frenosAbs=" + frenosAbs + ", sensoresColision="
                + sensoresColision + ", color=" + color + "]";
    }
}

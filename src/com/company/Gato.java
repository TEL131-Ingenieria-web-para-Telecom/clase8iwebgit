package com.company;

public class Gato extends Animal{
    private int alturaSalto;
    private int numeroVidas = 8;

    public void prueba() {
        System.out.println("hola");
    }
    public void prueba2() {
        System.out.println("hola");
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }
}

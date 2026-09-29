package com.parcial2;

public class Main {
    public static void main(String[] args) {
        //CAMBIO DE VALOR FINAL MR
        Vendedor v = new Vendedor("Brandon Mejía", 2530.0);
        v.cambiarEstrategia(new ComisionPersonalizada());
        v.mostrarDetalle();
    }
}
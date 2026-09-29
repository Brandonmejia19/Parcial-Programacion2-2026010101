package com.parcial2;

public class ComisionPersonalizada implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        int n = 7; 
        return montoVenta * ((5 + n) / 100.0);
    }
}
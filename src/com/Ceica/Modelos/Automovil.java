package com.Ceica.Modelos;

public class Automovil extends VehiculoMotorizado{
    private int nPuertas;

    public Automovil(String marca, String modelo, int fabricacionYear, String tipoCombustible, int nPuertas) {
        super(marca, modelo, fabricacionYear, tipoCombustible);
        this.nPuertas = nPuertas;
    }


    public boolean mostrarDetalles() {
        System.out.println(super.mostrarDetalles());
        System.out.println(nPuertas);
        return true;

    }
}

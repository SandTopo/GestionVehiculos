package com.Ceica.Modelos;

public class Motocicleta extends VehiculoMotorizado{
    private String tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int fabricacionYear, String tipoCombustible, String tipoMotocicleta) {
        super(marca, modelo, fabricacionYear, tipoCombustible);
        this.tipoMotocicleta = tipoMotocicleta;
    }
    public boolean mostrarDetalles() {
        System.out.println(super.mostrarDetalles());
        System.out.println(tipoMotocicleta);
        return true;

    }
}

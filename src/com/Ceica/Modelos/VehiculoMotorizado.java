package com.Ceica.Modelos;


public class VehiculoMotorizado extends Vehiculo{

    private String tipoCombustible;

    public VehiculoMotorizado() {
    }

    public VehiculoMotorizado(String marca, String modelo, int fabricacionYear, String tipoCombustible) {
        super(marca, modelo, fabricacionYear);
        this.tipoCombustible = tipoCombustible;
    }

    public boolean mostrarDetalles(){
        System.out.println(super.getMarca());
        System.out.println(super.getModelo());
        System.out.println(super.getFabricacionYear());
        System.out.println(tipoCombustible);
        return true;
    }
}


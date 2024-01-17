package com.Ceica.Modelos;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int fabricacionYear;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int fabricacionYear) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacionYear = fabricacionYear;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFabricacionYear() {
        return fabricacionYear;
    }

    public void setFabricacionYear(int fabricacionYear) {
        this.fabricacionYear = fabricacionYear;
    }

 public boolean mostrarDetalles(){
     System.out.println(marca);
     System.out.println(modelo);
     System.out.println(fabricacionYear);

     return true;
 }
}


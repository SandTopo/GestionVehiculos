package com.Ceica.Visualizador;

import com.Ceica.Modelos.Automovil;
import com.Ceica.Modelos.Motocicleta;
import com.Ceica.Modelos.Vehiculo;
import com.Ceica.Modelos.VehiculoMotorizado;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota","a",1976);
        Vehiculo vehiculo2 = new Vehiculo("Peugeot","b",1950);
        Vehiculo vehiculo3 = new Vehiculo("Seat","c",2001);
        VehiculoMotorizado vehiculo4 = new VehiculoMotorizado("Toyota","d",1987,"sin plomo 95");
        VehiculoMotorizado vehiculo5 = new VehiculoMotorizado("Chevrolet","e",2008,"super");
        Automovil vehiculo6 = new Automovil("citroen","f",1956,"sin plomo 95",4);
        Automovil vehiculo7 = new Automovil("wolswaggen","g",1988,"sin plomo 98",4);
        Automovil vehiculo8 = new Automovil("seat","h",1999,"sin plomo 98",2);
        Motocicleta vehiculo9 = new Motocicleta("kawasaki","i",1945,"sin plomo 95","deportiva");
        Motocicleta vehiculo10 = new Motocicleta("Hyundai", "j",2075,"diesel", "cruiser");
        System.out.println("vehículos");
        System.out.println("");
        vehiculo1.mostrarDetalles();
        System.out.println("");
        vehiculo2.mostrarDetalles();
        System.out.println("");
        vehiculo3.mostrarDetalles();
        System.out.println("");
        System.out.println("vehículos motorizados");
        System.out.println("");
        vehiculo4.mostrarDetalles();
        System.out.println("");
        vehiculo5.mostrarDetalles();
        System.out.println("");
        System.out.println("Automobiles");
        System.out.println("");
        vehiculo6.mostrarDetalles();
        System.out.println("");
        vehiculo7.mostrarDetalles();
        System.out.println("");
        vehiculo8.mostrarDetalles();
        System.out.println("");
        System.out.println("Motocicletas");
        System.out.println("");
        vehiculo9.mostrarDetalles();
        System.out.println("");
        vehiculo10.mostrarDetalles();



    }
}
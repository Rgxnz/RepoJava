/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author oriolarcroi
 */
public class coche extends vehiculo {

    private int numPuertas;

    static final double MAX_SPEED = 200;

    public coche() {
        super();
    }

    public coche(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion, int numPuertas) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
        this.numPuertas = numPuertas;

    }

    public coche(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n coche: ");
        if(numPuertas>=0)sb.append("\n numPuertas: ").append(numPuertas);
        return sb.toString();
    }
    
    @Override
    public double getPotencia() {
        return(super.getPotencia()*2);
    }
    
    
    
    

}

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
public class camion extends vehiculo {

    private double MMA;
    private double altura;

    static final double MAX_SPEED = 200;

    public camion() {
        super();
    }

    public camion(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion, double MMA, double altura) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
        this.MMA = MMA;
        this.altura = altura;

    }

    public camion(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
    }

    public double getMMA() {
        return MMA;
    }

    public void setMMA(double MMA) {
        this.MMA = MMA;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n camion: ");
        if(MMA >=0)sb.append("\n MMA: ").append(MMA);
        if(altura>=0)sb.append("\n altura: ").append(altura);
        return sb.toString();
    }

   

    
    
    
    

}

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
public class moto extends vehiculo {

    private boolean tieneSidecar;

    static final double MAX_SPEED = 200;

    public moto() {
        super();
    }

    public moto(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion, boolean tieneSidecar) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
        this.tieneSidecar = tieneSidecar;

    }

    public moto(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion) {
        super(marca, matricula, modelo, potencia, color, motor, TipoRueda, frenos, velocidad, precio, tipo, fechaFabricacion);
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n moto: ");
        sb.append("\n tieneSidecar: ").append(tieneSidecar);
        return sb.toString();
    }


    
    
    
    

}

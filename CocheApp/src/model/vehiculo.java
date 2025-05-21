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
public class vehiculo {

    static final double MAX_SPEED = 200;
    public vehiculo(){
    }
    public vehiculo(String marca, String matricula, String modelo, double potencia, ColorEnum color, String motor, String TipoRueda, double frenos, double velocidad, double precio, TipoEnum tipo, String fechaFabricacion) {
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
        this.color = color;
        this.motor = motor;
        this.TipoRueda = TipoRueda;
        this.frenos = frenos;
        this.setVelocidad(velocidad);
        this.precio = precio;
        this.tipo = tipo;
        this.fechaFabricacion = fechaFabricacion;
    }

    private String marca;
    private String matricula;
    private String modelo;
    private double potencia;
    private ColorEnum color;
    private String motor;
    private String TipoRueda;
    private double frenos;
    private double velocidad;
    private double precio;
    private TipoEnum tipo;
    private String fechaFabricacion;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTipoRueda() {
        return TipoRueda;
    }

    public void setTipoRueda(String TipoRueda) {
        this.TipoRueda = TipoRueda;
    }

    public double getFrenos() {
        return frenos;
    }

    public void setFrenos(double frenos) {
        this.frenos = frenos;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        if (velocidad >= 0) {
            if (velocidad <= MAX_SPEED) {
                this.velocidad = velocidad;
            } else {
                this.velocidad = MAX_SPEED;
            }
        } else {
            this.velocidad = 0;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo:\n");
        if (marca!=null)sb.append("\n Marca: ").append(marca);
        if (matricula!=null)sb.append("\n Matricula: ").append(matricula);
        if(modelo!=null)sb.append("\n Modelo: ").append(modelo);
        if(potencia > 0)sb.append("\n Potencia: ").append(potencia);
        if(color!=null)sb.append("\n Color: ").append(color);
        if(motor!=null)sb.append("\n Motor: ").append(motor);
        if(TipoRueda!=null)sb.append("\n Tipo Rueda: ").append(TipoRueda);
        if(frenos> 0)sb.append("\n Frenos: ").append(frenos);
        if(velocidad> 0)sb.append("\n Velocidad: ").append(velocidad);
        if(precio>0)sb.append("\n Precio: ").append(precio);
        if(tipo!=null)sb.append("\n Tipo: ").append(tipo);
        if(fechaFabricacion!=null)sb.append("\n Fecha Fabricacion: ").append(fechaFabricacion);
        return sb.toString();
    }


    // // METODOS
    public void acelerar() {
        setVelocidad(velocidad+10);
        System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");

    }

    public void acelerar(float num) {
            setVelocidad(velocidad + num);
            System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
        
    }

    public void frenar() {
        setVelocidad(velocidad-10);
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");

    }

    public void frenar(float num) {
        setVelocidad(velocidad - num);
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");

    }

    public void calcularAntiguedad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaFabricacionDate = LocalDate.parse(this.fechaFabricacion, formatter);

        Period periodo = Period.between(fechaFabricacionDate, LocalDate.now());
        int antiguedad = periodo.getYears();

        System.out.println("La antigüedad del coche es: " + antiguedad + " años");
    }
    

}

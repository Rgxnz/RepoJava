/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author oriolarcroi
 */
public abstract class MedioTransporte {
    private MedioTransEnum tipo;
    private boolean isPublic;

    public MedioTransporte(MedioTransEnum tipo, boolean isPublic) {
        this.tipo = tipo;
        this.isPublic = isPublic;
    }
    
    public MedioTransEnum getTipo() {
        return tipo;
    }

    public void setTipo(MedioTransEnum tipo) {
        this.tipo = tipo;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    
    public abstract double calcularPrecio();

    
}

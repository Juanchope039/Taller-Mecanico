/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;

/**
 *
 * @author Desarollo
 */
public class Propietario implements Serializable{
    
    private Long 
            cedula, 
            celular;
    
    private String 
            nombre;

    public Propietario(Long cedula, Long celular, String nombre) {
        this.cedula = cedula;
        this.celular = celular;
        this.nombre = nombre;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propietario").append('\n');
        sb.append("\tcedula:").append(cedula);
        sb.append("\tcelular:").append(celular);
        sb.append("\tnombre:").append(nombre);
        return sb.toString();
    }
    
    
    
}

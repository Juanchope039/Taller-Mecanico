/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.util.HashMap;

/**
 *
 * @author Desarollo
 */
public class Vehiculo {
    
    protected HashMap<LocalDate, Revision> susRevisiones;
    protected String placa;
    protected int modelo;
    protected Propietario suPropietario;

    public Vehiculo(HashMap<LocalDate, Revision> susRevisiones, String placa, int modelo, Propietario suPropietario) {
        this.susRevisiones = susRevisiones;
        this.placa = placa;
        this.modelo = modelo;
        this.suPropietario = suPropietario;
    }

    public HashMap<LocalDate, Revision> getSusRevisiones() {
        return susRevisiones;
    }

    public void setSusRevisiones(HashMap<LocalDate, Revision> susRevisiones) {
        this.susRevisiones = susRevisiones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Propietario getSuPropietario() {
        return suPropietario;
    }

    public void setSuPropietario(Propietario suPropietario) {
        this.suPropietario = suPropietario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo");
        sb.append("\n\tsusRevisiones:").append(susRevisiones);
        sb.append("\n\tplaca:").append(placa);
        sb.append("\n\tmodelo:").append(modelo);
        sb.append("\n\tsu Propietario:").append(suPropietario.toString());
        return sb.toString();
    }
    
    
    
}

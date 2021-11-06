/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author Desarollo
 */
public class Revision {
    
    private LocalDate fecha;
    private String descripcion, concepto;
    private double valorBase;

    public Revision(LocalDate fecha, String descripcion, String concepto, double valorBase) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.concepto = concepto;
        this.valorBase = valorBase;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revision");
        sb.append("\tfecha:").append(fecha);
        sb.append("\tdescripcion:").append(descripcion);
        sb.append("\tconcepto:").append(concepto);
        return sb.toString();
    }    
}

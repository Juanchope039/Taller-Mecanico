/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Desarollo
 */
public class Revision implements Serializable{
    
    private LocalDate fecha;
    private String descripcion, concepto;
    private double valorBase;
    private double descuento;

    public Revision(LocalDate fecha, String descripcion, String concepto, double valorBase, double descuento) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.concepto = concepto;
        this.valorBase = valorBase;
        this.descuento = descuento;
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
    
    public  double calcularValorAPagar(){
        return valorBase - descuento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Revisión: \n");
        sb.append(" Fecha: ").append(fecha);
        sb.append(" \tDescripcion: ").append(descripcion);
        sb.append(" \tConcepto: ").append(concepto).append("\n");
        sb.append(" Valor a pagar: ").append(calcularValorAPagar());
        return sb.toString();
    }    
}

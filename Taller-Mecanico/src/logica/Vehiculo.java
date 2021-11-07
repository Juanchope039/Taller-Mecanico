/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.LinkedList;

/**
 *
 * @author Desarollo
 */
public class Vehiculo implements Comparable<Vehiculo> {
    
    protected LinkedList<Revision> susRevisiones;
    protected String placa;
    protected int modelo;
    protected Propietario suPropietario;

    public Vehiculo(String placa, int modelo, Propietario suPropietario) {
        this.susRevisiones = new LinkedList<>();
        this.placa = placa;
        this.modelo = modelo;
        this.suPropietario = suPropietario;
    }

    public LinkedList<Revision> getSusRevisiones() {
        return susRevisiones;
    }

    public void setSusRevisiones(LinkedList<Revision> susRevisiones) {
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
    
    public double calcularDescuento() {        
        return 0;
    }

    @Override
    public String toString() {
        String res = 
                placa + " " + modelo + " " + 
                "Propietario: " + suPropietario.getCedula() + "" + suPropietario.getNombre() + "" + suPropietario.getCelular(); 
//                  + "Revisiones: \n" +  susRevisiones.toString();
                for (int i = 0; i < susRevisiones.size(); i++) {
                    
                    res+= "\n" + susRevisiones.get(i).toString();
        }
        return res;
    }

    @Override
    public int compareTo(Vehiculo t) {
        return placa.compareTo(t.getPlaca()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

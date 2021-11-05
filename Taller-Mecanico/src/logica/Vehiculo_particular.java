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
public class Vehiculo_particular extends Vehiculo{
    
    private String id_aseguradora;

    public Vehiculo_particular(String placa, int modelo, Propietario suPropietario, String id_aseguradora) {
        super(placa, modelo, suPropietario);
        this.id_aseguradora = id_aseguradora;
    }


    public String getId_aseguradora() {
        return id_aseguradora;
    }

    public void setId_aseguradora(String id_aseguradora) {
        this.id_aseguradora = id_aseguradora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo Particular");
        sb.append("\n\tsusRevisiones:").append(susRevisiones);
        sb.append("\n\tplaca:").append(placa);
        sb.append("\n\tmodelo:").append(modelo);
        sb.append("\n\tsu Propietario:").append(suPropietario.toString());
        sb.append("\n\tid aseguradora:").append(id_aseguradora);
        return sb.toString();
    }
    
    
}

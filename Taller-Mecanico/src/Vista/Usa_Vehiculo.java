/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.HashMap;
import logica.Revision;
import logica.Vehiculo;

/**
 *
 * @author Desarollo
 */
public class Usa_Vehiculo {
    
    private HashMap<String, Vehiculo> losVehiculos;
    private HashMap<String, Revision> lasRevisiones;
    
    public static void main(String[] args) {
        
    }
    
    public static String ListarVehiculosAtendidos(HashMap<String, Revision> info1, HashMap<String, Vehiculo> info2){
        String res = "*Lista de los Vehiculos Atendidos\n";
        
        for (String revision : info1.keySet()) {
            /**
             * Key list
             * fecha/(,)/Placa
             * 2020-10-02 , CPI-624,Juan
             * 2020-10-02 , APX-965,Andres
             * 2020-10-02 , UYT-852,Puche
             */
            String placa = revision.split(",")[1];
            
            //Hay que formatear la infomación de las filas
            res += info2.get(placa).toString() + "\n";
        }
        
        return res;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

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
        String res = 
                 "Placa: " +placa + " \tModelo: " + modelo + " \tAseguradora: " + id_aseguradora + "\n \n" + 
                "Propietario:\n CC: " + suPropietario.getCedula() + " \tNombre: " + suPropietario.getNombre() + " \tCel: " + suPropietario.getCelular()+ "\n"; 
//                  + "Revisiones: \n" +  susRevisiones.toString();
                for (int i = 0; i < susRevisiones.size(); i++) {
                    
                    res+= "\n" + susRevisiones.get(i).toString();
        }
        return res;
    }
    
    
}

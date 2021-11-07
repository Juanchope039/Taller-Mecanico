/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Desarollo
 */
public class Vehiculo_afiliado extends Vehiculo{
    
    private LocalDate fecha_Afiliacion;

    public Vehiculo_afiliado(String placa, int modelo, Propietario suPropietario,LocalDate fecha_afiliacion) {
        super(placa, modelo, suPropietario);
        this.fecha_Afiliacion = fecha_afiliacion;
    }


    public LocalDate getFecha_Afiliacion() {
        return fecha_Afiliacion;
    }

    public void setFecha_Afiliacion(LocalDate fecha_Afiliacion) {
        this.fecha_Afiliacion = fecha_Afiliacion;
    }

    @Override
    public double calcularDescuento() {
        
        LocalDate hoy = LocalDate.now();
        long difAños = ChronoUnit.YEARS.between(fecha_Afiliacion, hoy);
        
        return super.calcularDescuento() + (3000*difAños);
    }
    
    

    @Override
    public String toString() {
        
        
        String res = 
                "Placa: " +placa + " \tModelo: " + modelo + " \tFecha de afiliación: " + fecha_Afiliacion + "\n \n" + 
                "Propietario:\n CC: " + suPropietario.getCedula() + " \tNombre: " + suPropietario.getNombre() + " \tCel: " + suPropietario.getCelular()+ "\n"; 
//                  + "Revisiones: \n" +  susRevisiones.toString();
                for (int i = 0; i < susRevisiones.size(); i++) {
                    
                    res+= "\n" + susRevisiones.get(i).toString();
        }
        return res;
    }
    
    
}

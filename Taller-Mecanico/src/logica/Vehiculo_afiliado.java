/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

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
    
    public double calcularDescuento(){
        Long numeroAnnos = ChronoUnit.YEARS.between(LocalDate.now(), fecha_Afiliacion);
        return 3000 * numeroAnnos;
    }

    @Override
    public double calcularValorAPagar() {
        
        LocalDate hoy = LocalDate.now();
        long difDias = ChronoUnit.YEARS.between(hoy, fecha_Afiliacion);
        
        return super.calcularValorAPagar()- 3000*difDias; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public String toString() {
        
        
        String res = 
                placa + "" + modelo + "" + fecha_Afiliacion + "" + 
                "Propietario: " + suPropietario.getCedula() + "" + suPropietario.getNombre() + "" + suPropietario.getCelular(); 
//                  + "Revisiones: \n" +  susRevisiones.toString();
                for (int i = 0; i < susRevisiones.size(); i++) {
                    
                    res+= "\n" + susRevisiones.get(i).toString() + calcularValorAPagar();
        }
        return res;
    }
    
    
}

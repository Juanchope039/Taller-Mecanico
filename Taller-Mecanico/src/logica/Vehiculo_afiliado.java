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

    public Vehiculo_afiliado(Queue<Revision> susRevisiones, String placa, int modelo, Propietario suPropietario,LocalDate fecha_afiliacion) {
        super(susRevisiones, placa, modelo, suPropietario);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo Afiliado");
        sb.append("\n\tsusRevisiones:").append(susRevisiones);
        sb.append("\n\tplaca:").append(placa);
        sb.append("\n\tmodelo:").append(modelo);
        sb.append("\n\tsu Propietario:").append(suPropietario.toString());
        sb.append("\n\tfecha afiliacion:").append(fecha_Afiliacion);
        return sb.toString();
    }
    
    
}

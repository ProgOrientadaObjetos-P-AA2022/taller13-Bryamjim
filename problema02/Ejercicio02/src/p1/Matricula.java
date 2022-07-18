/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author SALA I
 */
public abstract class  Matricula {
    double tarifa;

    public void establecerTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    public double obtenerTarifa() {
        return tarifa;
    }
}
   

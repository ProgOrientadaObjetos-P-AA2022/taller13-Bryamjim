/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.Matricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;

/**
 *
 * @author reroes
 */
public class TipoMatricula extends Matricula{
    private ArrayList<Matricula> lista;
    private double promedioMatriculas;

    public void establecerLista(ArrayList<Matricula> list) {
        lista = list;
    }

    public ArrayList<Matricula> obtenerLista() {
        return lista;
    }

    
    public void establecerPromedioTarifas(ArrayList<Matricula> lista){
        double suma = 0;
        
        for (int i = 0; i < obtenerLista().size(); i++) { 
            suma = obtenerLista().get(i).obtenerTarifa(); 
            promedioMatriculas = suma / obtenerLista().size();
        }    
    }
    
    public double obtenerPromedioTarifas(){
        return promedioMatriculas;
    }
    
@Override
    public String toString(){
        return String.format("TV:%s\n%s\n",
                obtenerPromedioTarifas(),
                obtenerLista());
                
                
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas_tvs;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author SALA I
 */
public class ventas_tvs {

    ArrayList<Televisor> tele;
    double totalprecioTvs;
    double televisorMasCaro;
    String MarcasVendidas;

    public void establecertele(ArrayList<Televisor> t){
        tele = t;
    }   

    public ArrayList<Televisor> obtenertele(){
    return tele;
    }

    public void establecertotalPrecioTvs(ArrayList<Televisor> t){
        double s = 0;
        for (int i = 0; i < tele.size(); i++) {
            s = s + tele.get(i).obtenerPrecio();
            System.out.println(s);
        }
        totalprecioTvs = s;
    }
    public double obtenertotalPrecioTvs(){
    return totalprecioTvs;
    }
 
    public void establecertelevisorMasCaro(ArrayList<Televisor> t){
        double s = 0;
        // pass
        televisorMasCaro = s;
    }
    public double obtenertelevisorMasCaro(){
    return televisorMasCaro;
    }

    public void establecerMarcasVendidas(ArrayList<Televisor> t){
        String s = "";
        for (int i = 0; i < tele.size(); i++) {
            s = String.format("%s%s\n", s, tele.get(i).obtenerMarca());
        }
        MarcasVendidas = s;
    }
    public String obtenerMarcasVendidas(){
    return MarcasVendidas;
    }


@Override
    public String toString(){
        return String.format("TV:%s\n%s\n",
                obtenerMarcasVendidas (),
                obtenertelevisorMasCaro(),
                obtenertotalPrecioTvs());
                
                
    }
}

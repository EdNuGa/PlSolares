package placas.solares;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Núñez
 */
public class Casa {
    private String nif;
    private String nombre;
    private Integer superficie;
    private boolean interruptor = true;
    private ArrayList<Placas> placas = new ArrayList<>();
    private ArrayList<Aparato> aparatos = new ArrayList<>();
    
    public Casa(String nif, String nombre, Integer superficie){
        this.nif = nif;
        this.nombre = nombre;
        this.superficie = superficie;
    }
    
    public String getNif(){
        return this.nif;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Integer getSuperficie(){
        return this.superficie;
    }
    
    public boolean getInterruptor(){
        return this.interruptor;
    }
    
    public void setInterruptor(){
        this.interruptor = true;
    }
    
    public void setPlaca(Integer longitud, float precio, Integer potencia){
        Placas nueva = new Placas(longitud, precio, potencia);
        placas.add(nueva);
    }  
    
    public Integer getPlacas(){
        return placas.size();
    }
    
    public Integer getRestante(){
        Integer suma = 0;
        for(Placas laplaca : placas){
            suma = suma + laplaca.getSuperficie();
        }
        return suma;
    }
    
    /*public ArrayList placas(){
        for (Placas nuevaplaca : placas){
            return nuevaplaca.
        }
    }*/
}

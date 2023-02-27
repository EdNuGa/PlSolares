package placas.solares;

/**
 *
 * @author Eduardo Núñez
 */
public class Casa {
    private String nif;
    private String nombre;
    private Integer superficie;
    private boolean interruptor = true;
    private Placas[] placas;
    private Aparato[] aparatos;
    
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
    
}

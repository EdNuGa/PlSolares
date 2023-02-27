package placas.solares;

/**
 *
 * @author Eduardo Núñez
 */
public class Aparato {
    private String descripcion;
    private Integer consumo;
    private boolean interruptor;
    
    public Aparato(String descripcion, Integer consumo, boolean interruptor) {
        this.descripcion = descripcion;
        this.consumo = consumo;
        this.interruptor = interruptor;
    }
}

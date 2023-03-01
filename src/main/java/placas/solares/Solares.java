package placas.solares;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Núñez
 */
public class Solares {

    public static void main(String[] args) throws IOException {
        ArrayList<Casa> casas = new ArrayList<>();
        Placas[] listplacas = new Placas[10];
        int contador = 0;
        boolean salir = false;
        BufferedReader Consola = new BufferedReader(new InputStreamReader(System.in));
        
        do {
            System.out.print(">");
            String orden = Consola.readLine();
            String[] datos = orden.split(" ");
            if (datos.length > 0){
                switch(datos[0].toLowerCase()){
                    case "addcasa":
                        if (datos.length < 5) {
                            String nif = datos[1];
                            String nombre = datos[2];
                            String num = datos[3];
                            int superficie = Integer.parseInt(num);
                            if(superficie < 10){
                                System.out.println("La superficie debe ser mayor a 10 M2.");
                            } else {
                                Casa nueva = new Casa(nif, nombre, superficie);
                                casas.add(nueva);
                            }   
                        }
                        break;
                    case "addplaca":
                        String nif = datos[1];
                        String longitud = datos[2];
                        String valor = datos[3];
                        String consumo = datos[4];
                        int superficie = Integer.parseInt(longitud);
                        float precio = Float.parseFloat(valor);
                        int potencia = Integer.parseInt(consumo);                                                
                        //Falta buscar la casa y añadir a una lista.
                        for(Casa lacasa: casas){
                            Integer supTotal = lacasa.getSuperficie();
                            Integer supRest = lacasa.getRestante();
                            Integer resto = supTotal - supRest;
                            if(lacasa.getNif().equals(nif)){
                                if(superficie < resto){
                                    lacasa.setPlaca(superficie,precio,potencia);                                
                                } else {                                
                                    System.out.println("Controlador: NifCasa = " + lacasa.getNif());
                                }
                            } else{
                                System.out.println("ERROR: No hi ha espai disponible per a instal·lar aquesta placa.");
                            }
                                
                        }
                        
                        break;
                    case "addaparell":
                        //asd;
                        break;
                    case "oncasa":
                        for(Casa lacasa: casas){
                            if(lacasa.getNif() == args[1]){
                                if(lacasa.getInterruptor() == true){
                                    System.out.println("ERROR: La casa ja té l'interruptor encès.");
                                } else {
                                    lacasa.setInterruptor();
                                    System.out.println("OK: Interruptor general activat.");
                                }
                            } else {
                                System.out.println("ERROR: No s'ha trovat la casa.");
                            }
                        }
                        //asd;
                        break;
                    case "onaparell":
                        //asd;
                        break;
                    case "offaparell":
                        //asd;
                        break;
                    case "list":
                        System.out.println("--- Endolls Solars, S.L. ---");
                        System.out.println("Cases registrades: " + casas.size());
                        Integer contar = 1;
                        for(Casa lacasa : casas){
                            System.out.println("\nCasa " + contar);
                            System.out.println("Client: " + lacasa.getNif() + " - " + lacasa.getNombre());
                            System.out.println("Superficie teulada: " + lacasa.getSuperficie());
                            System.out.println("Superficie restant: ");
                            if(lacasa.getInterruptor() == true){
                                System.out.println("Interruptor general: encès");
                            } else {
                                System.out.println("Interruptor general: apagat");
                            }
                            System.out.println("Places solars instal·lades: " + lacasa.getPlacas());
                            System.out.println("Aparells registrats: " + "\n");
                            contar++;
                        }
                        break;
                    case "info":
                        //asd;
                        for(Casa lacasa : casas){
                            if(lacasa.getNif() == datos[1]){
                                System.out.println("Client: " + lacasa.getNif() + " - " + lacasa.getNombre());
                                System.out.println("Superficie teulada: " + lacasa.getSuperficie());
                                System.out.println("Superficie restant: ");
                                if(lacasa.getInterruptor() == true){
                                    System.out.println("Interruptor general: encès");
                                } else {
                                    System.out.println("Interruptor general: apagat");
                                }
                                System.out.println("Places solars instal·lades: ");
                                System.out.println("Aparells registrats: ");
                                System.out.println("");
                            }
                        }
                        break;
                    case "quit":
                        salir = true;
                        break;
                    default:
                        System.out.println("Error");
                }
                
                
                
            }
        } while(!salir);
        
        
    }
    
}

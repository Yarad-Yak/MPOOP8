/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop81;

/**
 *
 * @author Yarad Yamil
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {
    
    @Override
    public void tocar() {
        System.out.println("Tocando Instrumento de Viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
     }

    @Override
    public String tipoInstrumento() {
        return "Instrumento de Viento"; 
    }
    
}

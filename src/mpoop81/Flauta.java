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
public class Flauta extends InstrumentoViento{
    
    //Puede sobreescribir algun metodo y agregar funcionalidades
    
    public void tocarHimnoALaAlegria(){
        System.out.println("Tocando Himno a la Alegria");
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta Flautota Flautita";
    }
    
}

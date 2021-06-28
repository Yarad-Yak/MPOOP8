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
public class MPOOP81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Poligono poligono; //poligono -> null
        poligono = new Poligono(); //poligono -> obj creado por Poligono()
        System.out.println(poligono);
        
        Object objeto = poligono; //objeto -> a lo que apunta poligono
        System.out.println(objeto); //onjeto -> a objeto creado por Poligono()
        
        //Una referencia puede ser asignada a otros objetos
        
        poligono = new Triangulo();
        System.out.println(poligono);
        System.out.println(objeto);
        
        objeto = new Cuadrilatero();
        System.out.println(objeto);
        
        //poligono.setBase(6.5);
        poligono.area();
        
        queTipoEs(poligono);
        
        poligono = new Cuadrilatero();
        queTipoEs(poligono);
        
        System.out.println("########## INTERFAZ ##########");
        //Se puede crear una referencia a la interfaz pero no es posible instanciarla
        InstrumentoMusical inst;
        //inst = new InstrumentoMusical();
        
        //A una referencia a la interfaz puede ser asignada cualquier objeto
        inst = new Flauta();
        inst.tocar();
        inst.afinar();
        System.out.println(inst.tipoInstrumento());
    }
    
    public static void queTipoEs(Poligono p){ //Cualquier metodo puede recibir de cualquier otro tipo
        if(p instanceof Triangulo){            //Siempre que sea de una clase Padre
            Triangulo t = (Triangulo) p;
            System.out.println("Triangulo con base"+ t.getBase());
        }else if (p instanceof Cuadrilatero){
            Cuadrilatero c = (Cuadrilatero) p;
            System.out.println("Cuadrilatero");
        }
    }
}
    

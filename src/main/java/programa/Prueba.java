/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author reduan
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Moto prototipo = new Moto();
        
        System.out.println(prototipo.toString());
        
        Moto Cbr600rr = new Moto(600, 123, "Honda");
        
        System.out.println(Cbr600rr.toString());
        
    }
    
}

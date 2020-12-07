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
public class Moto {
    
    private int cilindranda;
    private int caballos;
    private String marca;

    public Moto() {
        
    }

    public Moto(int cilindranda, int caballos, String marca) {
        this.cilindranda = cilindranda;
        this.caballos = caballos;
        this.marca = marca;
    }

    public int getCilindranda() {
        return cilindranda;
    }

    public void setCilindranda(int cilindranda) {
        this.cilindranda = cilindranda;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" + "cilindranda=" + cilindranda + ", caballos=" + caballos + ", marca=" + marca + '}';
    }
    
}

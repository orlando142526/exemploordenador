/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploordenador;

/**
 *
 * @author DANIELCASTELAO\oyagualendara
 */
public class Rato {
     private String tipo;
    public Rato(String tipo){
        this.tipo=tipo;
    }
    public Rato(){
    
    }

    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
return tipo;
}
}
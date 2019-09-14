/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

/**
 *
 * @author USUARIO
 */
public class Espada extends Arma {
    
    @Override
    public void setArma(){
        super.nombre = "Espada";
    }
    
    @Override
    public void setImgDir(){
        this.img = "img/espada.png";                                              
    }
    
    public Espada(){
        super.nombre = "Espada";
        this.img = "img/espada.png";
        
    }
}

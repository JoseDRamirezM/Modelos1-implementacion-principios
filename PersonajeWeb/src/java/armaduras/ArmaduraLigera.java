/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduras;

/**
 *
 * @author USUARIO
 */
public class ArmaduraLigera extends Armadura {
         
    @Override
    public void setArmadura(){
        super.nombre = "Armadura Ligera";
    }
    
    @Override
    public void setImgDir(){
        this.img = "img/armaduraLigera.png"; 
    }      
    
    public ArmaduraLigera(){
        super.nombre = "Armadura Ligera";
        this.img = "img/armaduraLigera.png";
    }
}

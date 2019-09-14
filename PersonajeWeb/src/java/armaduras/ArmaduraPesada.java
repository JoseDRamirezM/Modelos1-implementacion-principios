/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduras;

/**
 *
 * @author Jose Ramirez
 */
public class ArmaduraPesada extends Armadura {
    
     @Override
    public void setArmadura(){
        super.nombre = "Armadura Pesada";
    }
    
    @Override
    public void setImgDir(){
        this.img = "img/armaduraPesada.png"; 
    }      
    
    public ArmaduraPesada(){
        super.nombre = "Armadura Pesada";
        this.img = "img/armaduraPesada.png";
    }
    
}

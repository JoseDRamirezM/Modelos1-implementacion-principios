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
public class ArmaduraDeGuerrero extends Armadura {
    
    @Override
    public void setArmadura(){
        super.nombre = "Armadura de Guerrero";
    }
    
    @Override
    public void setImgDir(){
        super.img = "img/armaduraDeGuerrero.png";
    }
    
    public ArmaduraDeGuerrero(){
        super.nombre = "Armadura de Guerrero";
        super.img = "img/armaduraDeGuerrero.png";
    }
}

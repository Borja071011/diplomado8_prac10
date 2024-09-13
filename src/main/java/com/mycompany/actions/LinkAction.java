
package com.mycompany.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
/**
 *
 * @author Admin
 * la clase que se encqarga de hacer la accion  con tiles hay
 * dos resultando dependiendo la accion arroja el resultado
 */
@Results({
    @Result(name="bienvenidoResult",location="bienvenidoTile",type="tiles")
    ,  @Result(name="personasResult",location="personasTile",type="tiles")
})
public class LinkAction extends ActionSupport {

    
    
    @Action(value="bienvenidoAction")
    public String bienvenido(){
        
    return "bienvenidoResult";
    
    }
    @Action(value="personasAction")
    public String personas(){
        
    return "personasResult";
    
    }
    
}


package org.reneyuman.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import org.reneyuman.system.Principal;


public class PrincipalController implements Initializable{
    private Principal escenarioPrincipal;

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
    
    
    public void ApertureVentana(){
        escenarioPrincipal.ApertureVentana();
        
    
    }
    
    public void UmbrellaVentana(){
        escenarioPrincipal.UmbrellaVentana();
        
    
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}

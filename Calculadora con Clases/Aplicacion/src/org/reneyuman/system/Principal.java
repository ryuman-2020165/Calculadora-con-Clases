/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.reneyuman.system;

import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.reneyuman.controller.ApertureController;
import org.reneyuman.controller.PrincipalController;
import org.reneyuman.controller.UmbrellaController;

/**
 *
 * @author Alejandro
 */
public class Principal extends Application{
    private final String PAQUETE_VISTA = "/org/reneyuman/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       launch(args);// TODO code application logic here
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
       this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Aplicacion");
        menuPrincipal();
        escenarioPrincipal.show();
    }
    
    public void menuPrincipal(){
        try{
            PrincipalController menuPrincipal = (PrincipalController)cambiarEscena("InicioView.fxml",600,364);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
    
    
    public void ApertureVentana(){
        try{
            ApertureController menuPrincipal = (ApertureController)cambiarEscena("ApertureView.fxml",817,459);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
    
    public void UmbrellaVentana(){
        try{
            UmbrellaController menuPrincipal = (UmbrellaController)cambiarEscena("UmbrellaView.fxml",775,485);
            menuPrincipal.setEscenarioPrincipal(this);
        }catch(Exception e){
            e.printStackTrace();
        
        }
    
    }
    
    
    
    
    public Initializable cambiarEscena(String fxml,int ancho, int alto) throws IOException{
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(PAQUETE_VISTA+fxml);
        cargadorFXML.setBuilderFactory(new JavaFXBuilderFactory());
        cargadorFXML.setLocation(Principal.class.getResource(PAQUETE_VISTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable)cargadorFXML.getController();
        return resultado;
    }
    
    
}

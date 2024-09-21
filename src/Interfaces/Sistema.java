/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author nmedi
 */
public class Sistema {
    private Lector lector;
    public Sistema(){
        
    }
    
    public String leerArchivo(String archivo){
        return this.lector.leer((archivo));
    }
    
    public void setLector(Lector lector){
        this.lector = lector;
    }
}

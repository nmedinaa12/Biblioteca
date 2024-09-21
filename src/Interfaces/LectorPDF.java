/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author nmedi
 */
public class LectorPDF implements Lector {
    
    @Override
    public String leer(String archivo){
        return "Estoy leyendo "+archivo+" como PDF";
    }
    
}

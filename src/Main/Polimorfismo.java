package Main;


import Herencia.Animal;
import Herencia.Gato;
import Herencia.Perro;
import Interfaces.Lector;
import Interfaces.LectorArchivoPlano;
import Interfaces.LectorPDF;
import Interfaces.Sistema;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nmedi
 */
public class Polimorfismo {
    
    public static void main(String[] args){
        //Polimorfismo
        Animal a = new Perro();
        Animal b = new Gato();
        
        a.makeSound();
        b.makeSound();
        
        //Polimorfismo por interfaces
        Lector lectorPlano = new LectorArchivoPlano();
        Lector lectorPDF = new LectorPDF();
        
        Sistema sistema = new Sistema();
        
        sistema.setLector(lectorPlano);
        System.out.println(sistema.leerArchivo("Estudiantes.txt"));
        
        sistema.setLector(lectorPDF);
        System.out.println(sistema.leerArchivo("Estudiantes.pdf"));
        
        
    }
    
}

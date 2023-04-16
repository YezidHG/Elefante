/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elefante;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Elefante {
//---------------Declaracion de variables------
    private float toneladaE;
    
//---------------Constructor---------
    public Elefante(float toneladaE){
        this.toneladaE = toneladaE;
    }
    
//---------------Metodos-------------
    public void setToneladas(float toneladas){
        this.toneladaE = toneladas;
    }
    
    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las toneladas que pesa el elefante adulto");
        this.setToneladas(scanner.nextFloat());
        
        while(this.toneladaE < 4 || this.toneladaE > 7.5){
            System.out.println("Ingrese un peso valido de toneladas que pesa el elefante adulto");
            this.setToneladas(scanner.nextFloat());
        }
    }
    
    public float conversion(){
        float kilogramosE = this.toneladaE*1000;
        return kilogramosE;
    }
 //----------Main
    public static void main(String[] args) {
        Elefante elefante1 = new Elefante(0);
        
        elefante1.pedirDatos();
        
        System.out.println("El peso del elefante en kilogramos es de: "+elefante1.conversion());
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Temperaturas.Grados;
import java.util.Scanner;

/**
 *
 * @author Equipo Lollipop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bCap = new Scanner(System.in);
        float bKml, bKml1, bKml2;
        Grados bTemp = new Grados();
        
        System.out.println("Ingresa una temperatura (Celsius): ");
        bKml = bCap.nextFloat();
        bKml1 = (((9/5)* bKml)+32);
        bTemp.setCaF(bKml1);
        bKml2 = (bKml)+273;
        bTemp.setCaK(bKml2);
        bTemp.setCelsius(bKml);
        
        
        System.out.println("Ingresa una temperatura (Fahrenheit): ");
        bKml = bCap.nextFloat();
        bKml1 = (bKml-32)*(5/9);
        bTemp.setFaC(bKml1);
        bKml2 = ((bKml-32)*(5/9)+273);
        bTemp.setFaK(bKml2);
        bTemp.setFahrenheit(bKml);
        
        
        System.out.println("Ingresa una temperatura (Kelvin): ");
        bKml = bCap.nextFloat();
        bKml1 = (bKml)-273;
        bTemp.setKaC(bKml1);
        bKml2 = (((bKml)-273)*(9/5))+32;
        bTemp.setKaF(bKml2);
        bTemp.setKelvin(bKml);
        
        System.out.println("La Temperatura en los diferentes grados son: ");
        System.out.print("La temperatura en °C: " + bTemp.getCelsius() + "°C que es igual a: " + bTemp.getCaF() + "°F y a: " + bTemp.getCaK() + "°K");
        System.out.print("la temperatura en °F: " + bTemp.getFahrenheit() + "°F que es igual a: " + bTemp.getFaC() + "°C y a: " + bTemp.getFaK() + "°K");
        System.out.print("la temperatura en °K: " + bTemp.getKelvin() + "°K que es igual a: " + bTemp.getKaC() + "°C y a: " + bTemp.getKaF() + "°F");
        
    }
    
}

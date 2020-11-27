/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathildasBondgård;

/**
 *
 * @author Mathilda
 */
public class Car {
    
    // ATTRIBUTES
    String brand;
    String model;
    String color;
    
    Car(String brand, String model, String color){
        
        this.brand = brand;
        this.model = model;
        this.color = color;
      
    }
    
    void speedUp(){
    System.out.println(brand + " is speeding up!");
    }
    
    void speedDown(){
    System.out.println(brand + " is hiting the brakes!");
    }
            
    // ACTIONS
            
    
}

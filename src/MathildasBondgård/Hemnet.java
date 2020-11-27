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
public class Hemnet {
    
    String address;
    int price;
    double squareMeter;
    int numberOfRooms;
    
    Hemnet(String address, int price, double squareMeter,int numberOfRooms){
        
        this.address = address;
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
    }
    
    void print(){
        System.out.println(address);
        System.out.println(price + "kr");
        System.out.println(squareMeter + "m2");
        System.out.println(numberOfRooms + " rum");
    }
    
}

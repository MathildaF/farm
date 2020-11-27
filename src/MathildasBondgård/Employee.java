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
public class Employee {
    
    // attribut
    int employeeId;
    String name;
    int age;
    String gender;
    Employee(int employeeId, String name, int age, String gender){
        
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        
    }
    // Egenskaper 
    void displayEmployee(){
    System.out.println("Name: " + name);
    System.out.println("Employee_ID: " + employeeId);
    System.out.println("Age: " + age);
    System.out.println("Gender: " + gender);
    }  
}

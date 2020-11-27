
package MathildasBondgård;

public class Dog {
    
   private String name;
        private int age;
    public Dog (String name, int age){
        
       this.name = name;
       this.age = age;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public void talk(){
        System.out.println("Woff!");
    }
     void sleep(){
         
         System.out.println("ZzzzZzz");
     }
     void eat(){
         System.out.println("Smask smask, yum yum!!");
     }
    
    
}

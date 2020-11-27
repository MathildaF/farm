
package MathildasBondgård;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Scanner;


public class ClassExcercise {
   
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        in.nextLine();
        ArrayList<Cat> cats = new ArrayList<>();   // En Array-lista för katter
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Horse> horses = new ArrayList<>();
        ArrayList<Cow> cows = new ArrayList<>();
        
      
        
        // Skapar katter och lägger in i listan
        cats.add(new Cat("Lukas",4));
        cats.add(new Cat("Marvin",12));
        cats.add(new Cat("Keno",1));
        
         Dog lassie = new Dog("Lassie", 8);
         dogs.add(lassie);
         Dog jolle = new Dog("Jolle", 3);
         dogs.add(jolle);
         Dog laban = new Dog("Laban", 2);
         dogs.add(laban);
         
         Horse maja = new Horse("Maja", 2);
         horses.add(maja);
         Horse sixten = new Horse("Sixten", 1);
         horses.add(sixten);
         Horse tova = new Horse("Tova", 6);
         horses.add(tova);
         
         Cow greta = new Cow("Greta", 7);
         cows.add(greta);
         Cow rosa = new Cow("Rosa", 2);
         cows.add(rosa);
         Cow kossmoss = new Cow("Kossmoss", 5);
         cows.add(kossmoss);
         Cow robert = new Cow("Robert", 6);
         cows.add(robert);
        
         for (Cat cat : cats) {            // För varje katt i katt-arrayen  - talk
            if (cat.getAge() < 4){
                cat.talk();
            }
            else cat.sleep();
        }
         
         for (int i = 0; i < cats.size(); i++) {
            cats.get(i).talk();
            
        }
         
         
         
         
       
         // Bonden kommer hem   -- Alla djur säger hej!
         
       
     
        
      
            
        
        
        
        
        
        
        /* ArrayList<Integer> arrayMultiDimensional = new ArrayList<>();
        String[][] array = new String[6][5];
        int columns = 5 , rows =6;
        for (int j = 0; j < columns; j++) {
        for (int k = 0; k < rows; k++) {
        array[k][j] = "[X]";
        }
        }for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
        System.out.print(array[i][j] + " ");
        }
        System.out.println("");  */
        // } 
    }
    
    public static void newCarMethod(){
        
        // brand model color
        Car myCar = new Car("Volvo","V70","blue");
        System.out.println(myCar.brand + myCar.color);
    }
    public static void newEmployeeMethod(){
        // employeeId,name, age, gender
        Employee vd = new Employee(1,"Mathilda Fritzell",28,"kvinna");
        
    }
    public static void hemnetMethod(Scanner in){
        // String address, int price, double squareMeter,byte numberOfRooms
        String address;
        int price;
        double squareMeter;
        int numberOfRooms;
        String apartments[] = new String [5];
        
       
        for (int i = 0; i<apartments.length; i++) {
            
            System.out.println("Adress: ");
            address = in.nextLine();
            System.out.println("Pris: ");
            price = in.nextInt();
            System.out.println("Kvadratmeter: ");
            squareMeter = in.nextDouble();
            System.out.println("Antal rum: ");
            numberOfRooms = in.nextInt();
            in.nextLine();
            
            apartments[i] = address +"\n"+price +"\n"+ squareMeter +"\n"+ numberOfRooms+"\n";
        }
        
        for (String apartment : apartments) {
            System.out.println(apartment);
            /*
            Hemnet lgh1 = new Hemnet("Ernst Torulfsgatan 11D", 3190000, 79.4, 3);
            Hemnet lgh2 = new Hemnet("Ottfjällsgatan 11", 2550000, 48, 2);
            Hemnet lgh3 = new Hemnet("Lagmansgatan 19", 4250000, 92, 3);
            Hemnet lgh4 = new Hemnet("Ernst Torulfsgatan 21 C",1895000, 37, 1);
            Hemnet lgh5 = new Hemnet("Lilla munkebäcksgatan 7A", 2450000, 61, 2);
            lgh1.print();
            lgh2.print();
            lgh3.print();
             */
        }
 
    }
    
}

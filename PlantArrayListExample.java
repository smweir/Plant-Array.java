import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class PlantArrayListExample{
                                                         
   public static void printArrayList(ArrayList<Plant> myGarden) {     
      for (int i = 0; i < myGarden.size(); ++i) {
            myGarden.get(i).printInfo();
            if (myGarden.get(i) instanceof Flower) {
                Flower flower = (Flower) myGarden.get(i);
                System.out.println("Annual: " + flower.isAnnual());
                System.out.println("Color of flowers: " + flower.getColor());
            }
            System.out.println();
   }
   }
   
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
    
     
      
      ArrayList<Plant> myGarden = new ArrayList<>();
      
      String input;
      
      while(!(input = scnr.next()).equals("-1")){      
         if (input.equals("plant")) {
            String plantName = scnr.next();
            String plantCost = scnr.next();
            
            Plant plant = new Plant();
            plant.setPlantName(plantName);
            plant.setPlantCost(plantCost);
            myGarden.add(plant);
            
         }
         else if (input.equals("flower")) {
            String flowerName = scnr.next();
            String flowerCost = scnr.next();
            boolean isAnnual = Boolean.parseBoolean(scnr.next());
            String color = scnr.nextLine().trim();
            
            Flower flower = new Flower(flowerName, flowerCost, isAnnual, color);
            myGarden.add(flower);
            
         }
        }
      
      
      printArrayList(myGarden);
   }
}

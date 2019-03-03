
import java.util.*;

// Xiaohui Wang  Nov29
public class Driver{
	
	public static void main(String args[]) {
		
		Food banana = new Food("Banana", 27, 0, 1);
        Food egg = new Food("Egg", 0, 5, 6);
        Food bagel = new Food("Bagel", 56, 2, 11);   
        
        ArrayList<String> headers = new ArrayList<>();   // specify columns of the table
		headers.add("Name");
		headers.add("Calories");
		
        // Strategy Method
        
		System.out.println("\nUsing strategy pattern below"); 	

        ArrayList<Food> listA = new ArrayList<>();       
        Strategy strategy = new foodStrategy(); 
        
        Table foodTable = new Table(headers,listA, strategy);
                
        foodTable.add(banana);
        foodTable.add(egg);
        foodTable.add(bagel);
        
        System.out.println(foodTable.print()); 
        
      
        // Template Method
        
        System.out.println("\nUsing template method below");  	

        ArrayList<Food> listB = new ArrayList<>();
        Template template = new foodTemplate();   
        
        TableTM foodTableTM = new TableTM(headers,listB, template);

        foodTableTM.add(banana);
        foodTableTM.add(egg);
        foodTableTM.add(bagel);
        
        System.out.println(foodTableTM.print());  
	}
}
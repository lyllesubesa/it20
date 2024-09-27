package main;


 

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        
        
          ItemManager list = new ItemManager();
          
          Scanner lylle = new Scanner(System.in);
          
          
                    
                   while(true){
         System.out.println("1. Entrance");
          System.out.println("2. Insert");
          System.out.println("3. Display");
          System.out.println("4. Updated");
          System.out.println("5. find items");
          System.out.println("6. Deleted all items");
           System.out.println("7. Leave");
       
           String scan = lylle.nextLine();
           
           
           if( scan.equals("1")) {
               System.out.println("Maayung pagsulod Amego");
                String Items = lylle.nextLine();
                     
    
           }else if( scan.equals("2")) {
               System.out.println("Unsa Man Imong Gusto e Insert?");
                String Items = lylle.nextLine();
                System.out.println();
                list.insertItem( Items);
                     System.out.println();
                     
                     
           } else if( scan.equals("3")){
                     
                     list.displayItems();
                        System.out.println();
                
                if( scan.equals("4")) {
               System.out.println("Basin naa kay gusto e update?");
            int item = Integer.parseInt(lylle.nextLine());
            
                     System.out.println(" Unsa imong gusto ilisan nga item? ");
                     String repItem = lylle.nextLine();
                     list.updateItem(item, repItem);
                      System.out.println();
                      
                       } else if( scan.equals("5")){
                     
                     System.out.println("Og unsa pod imong gusto e makit an? ");
                     String item = lylle.nextLine();
                     list.findItem(item);
                        System.out.println();
                     
                     
                 
                 } else if( scan.equals("6")){
                     
                    System.out.println("Unsa nga item ang gusto nimo e delete?");
                    list.displayItems();
                     int  index = Integer.parseInt(lylle.nextLine()) ;
                     list.deleteItem(index);
                     System.out.println();
                    
                  
                        
                 } else if( scan.equals("7")){
                     
                     System.out.println("Matsalam amgeeoo!! ");
                    break;
                     
                
                 } else {
                     System.out.println("shesssshhh");
                     
                  
                 }
                 
                 
                 
                 }
            
        
                   }
    }
}
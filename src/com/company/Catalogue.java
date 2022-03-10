package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogue {

  private int counter = 0;

  private Item[] items;


  public Catalogue (int number) {
    this.items = new Item[number];
  }


  public void addItem (Item i){
      items[counter++] = i;
    }

   public void addItemMenu(){
     // Scanner input ind her
     Scanner sc = new Scanner(System.in);
     String par1 = sc.nextLine();
     String par2 = sc.nextLine();
     addItem(new Item(par1, par2));
     System.out.println(Arrays.toString(getFullList()));
   }


   public Item[] getFullList(){
     //System.out.println(Arrays.toString(items));

     return items;
   }

   public Item[] getAvailableItems(){
    Item[] availables = new Item[items.length];

     for (int i = 0; i < items.length ; i++) {
       Item temp = items[i];
       if(temp != null && temp.showAvailability()){ // er temp forskellig fra null
         availables[i] = temp;
       }
     }
    return availables;
   }

   public Item findItem(String searchName){
     for (int i = 0; i < items.length ; i++) {
       Item temp = items[i];
        if (temp != null && temp.getDescription().equals(searchName)){
          return temp;
        }
     }
     return null; // "Det var ingen match"
   }


  public void borrowItem(Item found){
    found.makeAvailable();
    }


  public Item returnItem(Item found){

    return found;
  }
}


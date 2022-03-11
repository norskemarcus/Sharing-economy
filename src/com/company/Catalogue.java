package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogue {

  Scanner sc = new Scanner(System.in);

  private int counter = 0;
  private Item[] items;


  public Catalogue (int number) {
    this.items = new Item[number];
  }


  public void addItem (Item i){
      items[counter++] = i;
    }

   public void addItemMenu(){
     System.out.println("Hvilken kategori vil du tilføje?");
     String kategori = sc.nextLine();
     System.out.println("Hvilken genstand vil du tilføje?");
     String genstand = sc.nextLine();
     addItem(new Item(kategori, genstand));
     String kategoriLower = kategori.toLowerCase();
     String genstandLower = genstand.toLowerCase();

     System.out.println("Du har nu afleveret " + genstandLower + " i kategorien " + kategoriLower);
     System.out.println("Tak for dit bidrag til fællesskabet!");
     System.out.println(" ");
   }


   public Item[] getFullList(){

     for (int i = 0; i < counter ; i++) {
       Item temp = items[i];
       if (temp != null){
         System.out.println(temp);
       }
     }
     System.out.println(" ");
     return items; // never used
   }

   public Item[] getAvailableItems(){
    Item[] availables = new Item[counter];

     for (int i = 0; i < items.length ; i++) {
       Item temp = items[i];
       if(temp != null && temp.showAvailability()){ // er temp forskellig fra null
         availables[i] = temp;
       }
     }
     System.out.println(" ");
     return availables;
   }


   public Item findItem(String searchName){
     for (Item temp : items) {
       if (temp != null && temp.getDescription().equals(searchName)) {
         return temp;
       }
     }
     return null; // "Det var ingen match"
   }


  public void borrowItem(Item found){
    found.makeUnavailable();
    }


  public void returnItem(Item found){
    found.makeAvailable();
  }
}


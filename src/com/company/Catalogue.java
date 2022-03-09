package com.company;

public class Catalogue {

  private int counter = 0;

  private Item[] items;


  public Catalogue (int number) {
    this.items = new Item[number];
  }

  public void addItem (Item i){
// har attributterne: category, description, available
      items[counter++] = i;
    }

   public Item[] getFullList(){
     return items;
   }// for loop filtrere null fra

   public Item[] getAvailableItems(){
    Item[] availables = new Item[items.length];

     for (int i = 0; i < items.length ; i++) {
       Item temp = items[i];
       if(temp != null && temp.checkAvailability()){ // er temp forskellig fra null
         availables[i] = temp;
       }
     }
    return availables;
   }

  }

/*
metoder til at:
tilføje en ressource (tilføje Item objekt til arrayet)
finde en ressource (returnere Item objekt baseret på item description).
markere en ressource som udlånt (pågældende Item objekts available attribut sættes false)
markere at en ressource er kommet retur (modsat ovenfor)
finde alle ressourcer på lager (returnere hele arrayet)
finde alle tilgængelige ressource på lager (returnere et array med de Item objekter, hvor available attributten er true).
 */
package com.company;

import java.util.Scanner;

public class Program {

  public void mainMenu() {


    Catalogue catalogue = new Catalogue(10);
    Scanner input = new Scanner(System.in);
    int choice = -1;

    //Create items and add to catalogue --> Hvorfor gemmes ikke de indleverede ting?
    Item item1 = new Item("Sport", "Skateboard");
    catalogue.addItem(item1);
    Item item2 = new Item("Sport", "Mountainbike");
    catalogue.addItem(item2);
    Item item3 = new Item("Sport", "Skøjter");
    catalogue.addItem(item3);
    Item item4 = new Item("Sport", "Ski");
    catalogue.addItem(item4);
    Item item5 = new Item("Sport", "Staver");
    catalogue.addItem(item5);
    Item item6 = new Item("Sport", "Skistøvler");
    catalogue.addItem(item6);

    System.out.println("Velkommen til delingsplatformen for andelsforeningen");

    while (choice != 0) {

      System.out.println("Hvad kunne du tænke dig?");
      System.out.println("1. Se hele kataloget");
      System.out.println("2. Se hvad der er ledigt");
      System.out.println("3. Opret ting til udlån");
      System.out.println("4. Lån ting");
      System.out.println("5. Aflever ting");
      System.out.println("0. Afslut program");
      System.out.print("\nTast ind dit menuvalg: ");

      choice = input.nextInt();


      switch (choice) {
        case 1 -> // Se hele kataloget
            catalogue.getFullList();

        case 2 -> {
          // Se hvad der er ledigt
          Item[] availableItems = catalogue.getAvailableItems();
          System.out.println("Dette er ledig per dags dato: ");

          for (Item availableItem : availableItems) {
            System.out.println(availableItem);
          }
          System.out.println(" ");
        }


        case 3 -> // Opret ting til udlån
          catalogue.addItemMenu();



        case 4 -> {   // Lån ting
          catalogue.getAvailableItems();

          System.out.println("Hvad vil du låne? ");
          input.nextLine(); // OBS: undgå scannerbug!
          String search = input.nextLine();
          Item found = catalogue.findItem(search);
          catalogue.borrowItem(found);
          String searchLower = search.toLowerCase();

          System.out.println("Du har nu lånt " + searchLower + ".");
          System.out.println("Husk at aflevere indenfor 2 uger.");
          System.out.println(" ");
        }


        case 5 -> { //Aflevere ting
          System.out.println("Hvad vil du aflevere?");
          input.nextLine(); // OBS: undgå scannerbug!
          String description = input.nextLine();
          Item found = catalogue.findItem(description);
          System.out.println("Du har nu afleveret " + description + ".");
          System.out.println("Tak for at du afleverede indenfor fristen!");
          System.out.println(" ");
          catalogue.returnItem(found);
        }

        default ->
          System.out.println("Du foretog et ugyldigt valg.");


      }
    }
  }
}




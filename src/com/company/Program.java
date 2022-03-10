package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

  public void userProgram() {

    Catalogue catalogue = new Catalogue(10);
    Scanner input = new Scanner(System.in);
    int choice = -1;

    while (choice != 0) {

      System.out.println("Hvad kunne du tænke dig?");
      System.out.println("1. Se hele kataloget");
      System.out.println("2. Se hvad der er ledigt");
      System.out.println("3. Opret ting til udlån");
      System.out.println("4. Lån ting");
      System.out.println("5. Aflever ting");
      System.out.println("0. Afslut program");
      System.out.println("\nTast ind dit menuvalg: ");
      choice = input.nextInt();


      switch (choice) {
        case 1 -> {
          Item[] allItems = catalogue.getFullList();//Se hele kataloget
          for (int i = 0; i < allItems.length; i++) {
            System.out.println(allItems[i]);
          }
        }
        case 2 -> {
          // Se hvad der er ledigt
          Item[] availableItems = catalogue.getAvailableItems();
          for (int i = 0; i < availableItems.length; i++) {
            System.out.println(availableItems[i]);
          }
        }

        case 3 -> {
          catalogue.addItemMenu();  // Opret ting til udlån
        }


        case 4 -> {
          Item found = catalogue.findItem("Skateboard");
          catalogue.borrowItem(found); // Lån ting
        }

        case 5 -> {
          System.out.println("Hvad vil du søge efter?");
          String description = input.nextLine();

          Item found = catalogue.findItem(description);
          catalogue.returnItem(found);
        }

        default -> {
          System.out.println("Du foretog et ugyldigt valg.");

        }
      }
    }
  }
}




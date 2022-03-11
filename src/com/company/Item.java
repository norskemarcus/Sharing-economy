package com.company;

public class Item {

  private String category;
  private String description;
  private boolean isAvailable; //attributter, variabel som tilhører et objekt

  public String toString() {
    if (!isAvailable) {
      return "Category: " + category + "\nDescription: " + description + "\nLedig?: " + isAvailable + "\n";
    } else {
      return "Category: " + category + "\nDescription: " + description + "\nLedig?: " + isAvailable + "\n";
    }
  }

  public String getDescription(){
    return description;
  }

  public Item(String category, String description) {
    this.category = category;
    this.description = description;
    this.isAvailable = true;
    //String ledig = isAvailable.toString();
  }

/*
  public Item(String category, String item, boolean available) {
    this.category = category;
    this.description = item;
    this.isAvailable = available;
  }


 */

  public boolean showAvailability(){
    return isAvailable;
  }

  public void makeUnavailable(){
    isAvailable = false;

  }


  public void makeAvailable() {
    isAvailable = true;
  }

  }




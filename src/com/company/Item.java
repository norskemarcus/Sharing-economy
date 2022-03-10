package com.company;

public class Item {

  private String category;
  private String description;
  private boolean isAvailable; //attributter, variabel som tilhører et objekt

  public String toString() {
    // Ændre true til ledig
    return category + " " + description + " " + isAvailable;
  }

  public String getDescription(){
    return description;
  }

  public Item(String category, String item) {
    this(category, item, true);
  }


  public Item(String category, String item, boolean available) {
    this.category = category;
    this.description = item;
    this.isAvailable = available;
  }


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




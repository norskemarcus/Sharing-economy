package com.company;

public class Item {

  private String category;
  private String description;
  private boolean isAvailable; //attributter, variabel som tilhører et objekt

  public String toString() {
    if (!isAvailable) {
      return "Kategori: " + category  + "\nGenstand: " + description + "\nLedig? " + isAvailable + "\n";
    } else {
      return "Kategori: " + category + "\nGenstand: " + description + "\nLedig? " + isAvailable + "\n";
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


  public boolean showAvailability(){ //bruger jeg denne?
    return isAvailable;
  }

  public void makeUnavailable(){
    isAvailable = false;

  }

  public void makeAvailable() {
    isAvailable = true;
  }

  }




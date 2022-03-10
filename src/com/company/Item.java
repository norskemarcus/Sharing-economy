package com.company;

public class Item {

  private String category;
  private String description;
  private boolean isAvailable;

  public String toString() {
    return category + " " + description + " " + isAvailable;
  }

  public String getDescription(){
    return description;
  }

  public Item(String category, String item) {
    this.category = category;
    this.description = item;
    this.isAvailable = true;
  }

  public Item(String category, String item, boolean available) {
    this.category = category;
    this.description = item;
    this.isAvailable = true;
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

  public void setAvailable(boolean available) {
    this.isAvailable = available;
  }

}


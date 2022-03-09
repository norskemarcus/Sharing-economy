package com.company;

public class Item {

  private String category;
  private String item;
  private boolean isAvailable;

  public String toString(){
    return category + " " + item;
  }

  public Item (String category, String item){
  this.category = category;
  this.item=item;
  isAvailable = true;
  }
}

package com.company;

public class TestSharedRessources {

    public static void main(String[] args) {

    Program program = new Program();
    Catalogue catalogue = new Catalogue(10);

        //Create items and add to catalogue
        Item item1 = new Item("Sport", "Skateboard");
        catalogue.addItem(item1);
        Item item2 = new Item("Sport", "Mountainbike");
        catalogue.addItem(item2);
        Item item3 = new Item("Tøj", "Smoking");
        catalogue.addItem(item3);
        Item item4 = new Item("Tøj", "Pailletkjole");
        catalogue.addItem(item4);

    program.mainMenu();
    }

}
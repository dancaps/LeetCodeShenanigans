package com.dancaps.leet;

/**
 * Testing the SinglyLinkedDingly list
 */
public class TestingSinglyLinkedDingly {

    public static void main(String[] args) {

        System.out.println("<== Testing String Type");
        SinglyLinkedDingly<String> sldString = new SinglyLinkedDingly<>(); //Creates a new list of String type
        System.out.println(sldString); //Prints the empty list
        sldString.add("Karen");
        sldString.add("Chad");
        sldString.add("Bill");
        sldString.add("Melissa");
        System.out.println("<== Size:    " + sldString.size());
        System.out.println(sldString); //Prints the populated list
        System.out.println("<== Removed: " + sldString.remove());
        System.out.println("<== Removed: " + sldString.remove());
        System.out.println("<== Size:    " + sldString.size());
        System.out.println(sldString); //Prints the updated list
        System.out.println("<== Removed: " + sldString.remove());
        System.out.println("<== Removed: " + sldString.remove());
        System.out.println("<== Size:    " + sldString.size());
        System.out.println("<== Removed: " + sldString.remove());
        System.out.println("<== Size:    " + sldString.size());
        System.out.println(sldString); //Prints the populated list
        System.out.println();

        System.out.println("<== Testing Human Type");
        SinglyLinkedDingly<Human> sldHuman = new SinglyLinkedDingly<>(); //Creates a new list of Human type
        System.out.println(sldHuman); //Prints the empty list
        sldHuman.add(new Human());
        sldHuman.add(new Human());
        sldHuman.add(new Human());
        sldHuman.add(new Human());
        System.out.println("<== Size:    " + sldHuman.size());
        System.out.println(sldHuman); //Prints the populated list
        System.out.println("<== Removed: " + sldHuman.remove());
        System.out.println("<== Removed: " + sldHuman.remove());
        System.out.println("<== Size:    " + sldHuman.size());
        System.out.println(sldHuman); //Prints the updated list
        System.out.println("<== Removed: " + sldHuman.remove());
        System.out.println("<== Removed: " + sldHuman.remove());
        System.out.println("<== Size:    " + sldHuman.size());
        System.out.println("<== Removed: " + sldHuman.remove());
        System.out.println("<== Size:    " + sldHuman.size());
        System.out.println(sldHuman); //Prints the populated list
        System.out.println();

        System.out.println("<== Testing Integer Type");
        SinglyLinkedDingly<Integer> sldInt = new SinglyLinkedDingly<>(); //Creates a new list of Integer type
        System.out.println(sldInt); //Prints the empty list
        sldInt.add(16);
        sldInt.add(-128);
        sldInt.add(0);
        sldInt.add(512);
        System.out.println("<== Size:    " + sldInt.size());
        System.out.println(sldInt); //Prints the populated list
        System.out.println("<== Removed: " + sldInt.remove());
        System.out.println("<== Removed: " + sldInt.remove());
        System.out.println("<== Size:    " + sldInt.size());
        System.out.println(sldInt); //Prints the updated list
        System.out.println("<== Removed: " + sldInt.remove());
        System.out.println("<== Removed: " + sldInt.remove());
        System.out.println("<== Size:    " + sldInt.size());
        System.out.println("<== Removed: " + sldInt.remove());
        System.out.println("<== Size:    " + sldInt.size());
        System.out.println(sldInt); //Prints the populated list
        System.out.println();

        System.out.println("Creating a massive amount of Humans");
        SinglyLinkedDingly<Human> humans = new SinglyLinkedDingly<>(); //Creates a new list of Human type
        int NUMBER_OF_HUMANS = 50000;
        for (int h = 0; h < NUMBER_OF_HUMANS; h++) {
            humans.add(new Human());
        }
        System.out.println("<== Size of humans list: " + humans.size());
        System.out.println(humans);
    }
}

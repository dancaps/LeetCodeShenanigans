package com.dancaps.leet;

import java.util.Random;

/**
 * Human class to use for testing generics
 */
public class Human {
    private final String name;
    private final int age;

    /**
     * Constructing a generic human.
     */
    public Human() {
        String[] names = {"Kate", "Mike", "Linda", "Kevin", "Steve", "Bill", "Sandy"};
        Random random = new Random();
        this.name = names[random.nextInt(names.length)];
        this.age = random.nextInt(130);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

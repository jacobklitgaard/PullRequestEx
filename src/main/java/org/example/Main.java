package org.example;

public class Main {
    static void main() {
        int number = "10";                     // Fejl 1
        System.out.println("Number is: " + number)

        if (number > 5) {                      // Fejl 2
            System.out.println("Number is big");
        }

        for (int i = 0; i < 5; i++)            // Fejl 3
            System.out.println(i);

        String name = null;
        System.out.println(name.length());     // Fejl 4

        int[] numbers = new int[3];
        numbers[3] = 7;
    }
}


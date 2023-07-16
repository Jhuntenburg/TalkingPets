package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        getUserInput();
    }

    static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int numberOfPetsUserHas = 0;

        List<String> petNames = new ArrayList();
        List<String> petAges = new ArrayList();

        System.out.print("HOW MANY PETS DO YOU HAVE?  ");

        numberOfPetsUserHas = scanner.nextInt();

        for (int i = 1; i <= numberOfPetsUserHas; i++) {
            System.out.println(" WHAT IS THE NAME OF PET # " + i + ".");
            petNames.add(scanner.next());
            System.out.println(" WHAT IS THE AGE OF PET # " + i + ".");
            petAges.add(scanner.next());
        }
        scanner.close();

        System.out.println("LIST OF PETS:");
        int count = 1;
        for (String name : petNames) {
            int index = count - 1;
            System.out.println("Pet #" + count + " - Name: " + name + ", Age: " + petAges.get(index));
            count++;
        }


    }

}

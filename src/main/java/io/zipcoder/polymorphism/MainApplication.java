package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class MainApplication extends Pet {
    public static void main(String[] args) {
        List<Pet> petList = getUserInput();
        printPetList(petList);
    }


    static List<Pet> getUserInput() {

    /* static void getUserInput() {
     *    Scanner scanner = new Scanner(System.in);
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
         }*/
        List<Pet> petList = new ArrayList<>();
        int numberOfPets;
        String petType;
        String petName;
        Scanner numberOfPetsScanner = new Scanner(System.in);
        Scanner petTypeScanner = new Scanner(System.in);
        Scanner petNameScanner = new Scanner(System.in);
        System.out.print("HOW MANY PETS DO YOU HAVE?  ");
        numberOfPets = numberOfPetsScanner.nextInt();
        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("WHAT KIND OF PET IS PET " + i + "?\n" +
                    "cat, dog, or pig?  ");
            petType = petTypeScanner.nextLine();
            if (Objects.equals(petType, "dog")) {
                System.out.println("WHAT IS THE" + petType + "'s Name?");
                petName = petNameScanner.nextLine();
                Pet dog = new Dog(petName);
                petList.add(dog);
            }
            if (Objects.equals(petType, "cat")) {
                System.out.println("WHAT IS THE" + petType + "'s Name?");
                petName = petNameScanner.nextLine();
                Pet cat = new Cat(petName);
                petList.add(cat);
            }
            if (Objects.equals(petType, "pig")) {
                System.out.println("WHAT IS THE" + petType + "'s Name?");
                petName = petNameScanner.nextLine();
                Pet pig = new Pig(petName);
                petList.add(pig);
            }


            }
        return petList;

        }

    static void printPetList(List<Pet> petList) {
        System.out.println("LIST OF PETS:");
        for (Pet pet : petList) {
            System.out.println("Name: " + pet.getName() + ", Says: " + pet.speak());
        }
    }

    }


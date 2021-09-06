package org.inroduction.info.Lesson13HA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    private static List<Warrior> warriorsList = new ArrayList<>();

    public static void main(String[] args) {

        Warrior elfOne = new Elf("male", 10, "elfOne", 12, false);
        Warrior elfTwo = new Elf("male", 7, "elfTwo", 13, false);

        Warrior archerOne = new Archer("female", 10, "archerOne", 22, true, 20);
        Warrior archerTwo = new Archer("male", 10, "archerTwo", 24, true, 20);
        Warrior archerThree = new Archer("female", 10, "archerThree", 20, true, 20);

        Warrior swordMan1 = new SwordMan("male", 10, "swordManOne", 44, true, 30);
        Warrior swordMan2 = new SwordMan("female", 12, "swordManTwo", 56, true, 30);
        Warrior swordMan3 = new SwordMan("female", 9, "swordManThree", 30, true, 30);
        Warrior swordMan4 = new SwordMan("male", 11, "swordManFour", 23, true, 30);
        Warrior swordMan5 = new SwordMan("male", 8, "swordManFive", 43, true, 30);

        Warrior dwarf1 = new Dwarf("female", 22, "dwarf1", 33, true, 40);
        Warrior dwarf2 = new Dwarf("male", 38, "dwarf2", 36, true, 40);
        Warrior dwarf3 = new Dwarf("female", 30, "dwarf3", 19, true, 40);

        collectArmy(elfOne, elfTwo, archerOne, archerTwo, archerThree, swordMan1, swordMan2, swordMan3, swordMan4, swordMan5, dwarf1, dwarf2, dwarf3);

        for (Warrior element : warriorsList) {
            element.sayHello();
            element.attack();
        }

        System.out.println();

        List<Flyable> flyableList = new ArrayList<>();
        List<Swimmable> swimmableList = new ArrayList<>();
        List<Warrior> bothList = new ArrayList<>();

        for (Warrior element : warriorsList) {

            if (element instanceof Flyable && element instanceof Swimmable) {
                bothList.add(element);
                continue;
            }

            if (element instanceof Flyable) {
                flyableList.add((Flyable) element);
            }

            if (element instanceof Swimmable) {
                swimmableList.add((Swimmable) element);
            }
        }

        System.out.println("Flyable and Swimmable :");
        for (Warrior element : bothList
        ) {
            System.out.println(element);
            System.out.println();

        }

        System.out.println("Flyable: ");
        for (Flyable element : flyableList
        ) {
            System.out.println(element);
            element.fly();
            System.out.println();
        }

        System.out.println("Swimmable: ");
        for (Swimmable element : swimmableList
        ) {
            System.out.println(element);
            element.swim();
            System.out.println();
        }

    }

    private static void collectArmy(Warrior... warrior) {
        warriorsList = Arrays.asList(warrior);
    }
}

package org.inroduction.info.Lesson13HA;

public class Archer extends Elf implements Flyable {

    private int bowStrength;

    public Archer(String gender, int strength, String name, int protection, boolean hasWeapon, int bowStrength) {
        super(gender, strength, name, protection, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with bow with " + (strength + bowStrength) + " points");
    }

    @Override
    public String toString() {
        return "My name is " + getName();
    }

    @Override
    public void fly() {
        System.out.println("I am archer and I can fly");
    }
}

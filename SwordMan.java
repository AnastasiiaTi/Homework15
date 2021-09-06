package org.inroduction.info.Lesson13HA;

public class SwordMan extends Elf implements Swimmable {

    private int swordStrength;

    public SwordMan(String gender, int strength, String name, int protection, boolean hasWeapon, int swordStrength) {
        super(gender, strength, name, protection, hasWeapon);
        this.swordStrength = swordStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with sword with " + (strength + swordStrength) + " points");
    }

    @Override
    public String toString() {
        return "My name is " + getName();
    }

    @Override
    public void swim() {
        System.out.println("I am swordMan and I can swim");
    }
}

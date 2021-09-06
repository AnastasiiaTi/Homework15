package org.inroduction.info.Lesson13HA;

public class Dwarf extends Warrior implements Swimmable, Flyable {

    protected boolean hasWeapon;

    private int axeStrength;

    public Dwarf(String gender, int strength, String name, int protection, boolean hasWeapon, int axeStrength) {
        super(gender, strength, name, protection);
        this.hasWeapon = hasWeapon;
        this.axeStrength = axeStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with axe with " + (strength + axeStrength) + " points");
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " I can swim and fly!";
    }

    @Override
    public void swim() {
        System.out.println("I am dwarf and I can swim");
    }

    @Override
    public void fly() {
        System.out.println("I am dwarf and I can fly");
    }
}

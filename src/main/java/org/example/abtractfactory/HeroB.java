package org.example.abtractfactory;

import org.example.abtractfactory.Hero;

class HeroB implements Hero {
    public void ability1() {
        System.out.println("Ability 1: Heal");
    }
    public void ability2() {
        System.out.println("Ability 2: Invisibility");
    }
    public void ability3() {
        System.out.println("Ability 3: Speed Boost");
    }
    public void ultimate() {
        System.out.println("Ultimate: Global Heal");
    }
}

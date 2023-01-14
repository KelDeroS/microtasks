package org.example.abtractfactory;

class HeroA implements Hero {
    public void ability1() {
        System.out.println("Ability 1: Damage");
    }
    public void ability2() {
        System.out.println("Ability 2: Slow");
    }
    public void ability3() {
        System.out.println("Ability 3: Silence");
    }
    public void ultimate() {
        System.out.println("Ultimate: Global Silence");
    }
}
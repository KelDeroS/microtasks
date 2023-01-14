package org.example.abtractfactory;

class HeroBFactory implements HeroFactory {
    public Hero createHero() {
        return new HeroB();
    }
}
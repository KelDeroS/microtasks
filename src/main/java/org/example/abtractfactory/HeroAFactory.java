package org.example.abtractfactory;

class HeroAFactory implements HeroFactory {
    public Hero createHero() {
        return new HeroA();
    }
}
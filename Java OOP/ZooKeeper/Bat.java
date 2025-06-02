class Bat extends Mammal {

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("Bat is airborne! (Energy -50)");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("Bat has eaten a human! (Energy +25)");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("Bat has attacked a town! (Energy -100)");
    }
}
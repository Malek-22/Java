class Mammal {
    protected int energy;

    public Mammal() {
        this.energy = 100;
    }

    public int displayEnergy() {
        System.out.println("Current energy:  " + this.energy);
        return this.energy;
    }
}
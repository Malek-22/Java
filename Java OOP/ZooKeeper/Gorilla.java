class Gorilla extends Mammal {

    public void throwSomething() {
        this.energy -= 5;
        System.out.println("Gorilla has thrown something! (Energy -5)");
    }

    public void eatBananas() {
        this.energy += 10;
        System.out.println("Gorilla has eaten bananas and looks satisfied! (Energy +10)");
    }

    public void climb() {
        this.energy -= 10;
        System.out.println("Gorilla has climbed a tree! (Energy -10)");
    }
}
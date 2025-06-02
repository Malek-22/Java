public class ZooTest {
    public static void main(String[] args) {

        // Test the Gorilla:
        System.out.println("---- Testing Gorilla ----");
        Gorilla gorilla = new Gorilla();

        // throws something 3 times:
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        // eats bananas 2 times:
        gorilla.eatBananas();
        gorilla.eatBananas();

        // climbs once:
        gorilla.climb(); 

        // display the final energy for the gorilla:
        System.out.println("Gorilla's final energy:");
        gorilla.displayEnergy();

        // Test the Bat:
        System.out.println("\n---- Test Bat ----");
        Bat bat = new Bat();

        // attacks 3 towns:
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        // eats humans 2 times:
        bat.eatHumans();
        bat.eatHumans();

        // fly 2 times:
        bat.fly();
        bat.fly();

        // display final energy for the eat:
        System.out.println("Bat's final energy:");
        bat.displayEnergy();
    }
}
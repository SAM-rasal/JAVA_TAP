class Animal {
    private int legs;
    private String type;
    private String habitat;

    // Default Constructor
    public Animal() {
        this.legs = 2;
        this.type = "Carnivorous";
        this.habitat = "Land";
    }

    // Parameterized Constructor
    public Animal(int legs, String type, String habitat) {
        this.legs = legs;
        this.type = type;
        this.habitat = habitat;
    }

    // Setter and Getter for legs
    public void setlegs(int legs) {
        this.legs = legs;
    }

    public int getlegs() {
        return legs;
    }

    // Setter and Getter for type
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    // Setter and Getter for habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    // Method
    public void walk() {
        System.out.println("Generally animals walk on 4 legs");
    }

    @Override
    public String toString() {
        return "Legs : " + legs + " | Type : " + type + " | Habitat : " + habitat;
    }
}

// Dog class extends Animal
class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dogs walk on 4 legs");
    }

    public void AnimalWalk() {
        super.walk(); // calls Animal's walk()
    }

    public void AnimalLegs() {
        int getLeg = super.getlegs(); // call method
        System.out.println("Animal legs = " + getLeg);
    }
}

// Main class
public class Super {
    public static void main(String[] args) {
        Animal animal = new Animal(2, "Carnivore", "Land");
        Dog husky = new Dog();
        Dog lab = new Dog();
        System.out.println(husky);
        husky.walk();         // Dog’s walk()
        husky.AnimalWalk();   // Animal’s walk()
        husky.AnimalLegs();   // Calls parent getter
        System.out.println(lab);
        lab.walk();
        lab.AnimalWalk();
        lab.AnimalLegs();
    }
}

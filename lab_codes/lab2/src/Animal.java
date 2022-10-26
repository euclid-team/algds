public class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("Dog goes woof");
    }
}

class Fox extends Animal {
    public void animalSound() {
        System.out.println("What does the fox say");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myDog = new Dog();  // Create a Dog object
        Animal myFox = new Fox();  // Create a Fox object
        myAnimal.animalSound();
        myDog.animalSound();
        myFox.animalSound();
    }
}

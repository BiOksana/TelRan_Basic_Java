package thirdLesson.homeWork3;

public class Dog {
    String name;
    String breed;
    static int totalDogs;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        totalDogs++;
    }

    public void printDogInfo() {
        System.out.println("Dog's name: " + name + ", dog's breed: " + breed);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", "mops");
        dog.printDogInfo();
        System.out.println(Dog.totalDogs);
    }
}

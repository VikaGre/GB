public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsic", 400, 4);
        Cat cat1 = new Cat("Pyshok", 100, 5);

        Dog dog = new Dog("Sharic", 350, 6);

        cat.run();
        cat.swim();
        System.out.println();

        cat1.run();
        cat1.swim();
        System.out.println();

        dog.run();
        dog.swim();
        System.out.println();

    }
}

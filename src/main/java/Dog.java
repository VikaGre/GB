public class Dog extends Animals {

    static int countdog = 0;

    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);

        countdog++;
        System.out.println("Dogs are " + countdog);
        System.out.println();
    }

    @Override
    public void run() {
        super.run();
        if (distanceRun > 500) {
            System.out.println("It is out of bounds");
        }
    }

    @Override
    public void swim() {
        super.swim();
        if (distanceSwim > 10) {
            System.out.println("It is out of bounds");
        }
    }

}

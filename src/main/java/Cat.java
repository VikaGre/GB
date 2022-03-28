public class Cat extends Animals {

    static int countCats = 0;

    public Cat (String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);

        countCats++;
        System.out.println("Cats are " + countCats);
        System.out.println();
    }

    @Override
    public void run() {
        if (distanceRun > 200) {
            System.out.println("It is out of bounds");
        } else {
            System.out.println(name + " has run " + distanceRun + " meters");
        }
    }

    @Override
    public void swim() {
        System.out.println("Cats can't swim");
    }

}

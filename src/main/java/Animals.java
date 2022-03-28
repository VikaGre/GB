public class Animals {
    public String name;
    public int distanceRun;
    public int distanceSwim;

    static int count = 0;

    public Animals(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;

        count++;
        System.out.println("Animals are " + count);
        System.out.println();
    }


    public void run() {
        System.out.println(name + " has run " + distanceRun + " meters");
    }

    public void swim() {
        System.out.println(name + " has swum " + distanceSwim + " meters");
    }

}

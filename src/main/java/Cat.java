public class Cat {

    public String name;
    public int appetite;
    public int satiated; //cat's satiated

    public Cat(String name, int appetite, int satiated) {
        this.name = name;
        this.appetite = appetite;
        this.satiated = satiated;
    }

    public void eat(Plate plate) {

        if (satiated/2 > plate.foodQuantity) {
            System.out.println("There are not enough food"); //task 4
        } else {
            System.out.println("Cat " + name + " started to eat. It has eaten " + appetite);
            plate.decreaseFood(appetite);

            satiated = satiated - appetite;
            System.out.println("Cat's satiation is " + satiated);
        }
    }

    public boolean Satiated() { //task 3
        if (satiated == 0) {
            return true;
        } else {
            return false;
        }
    }
}

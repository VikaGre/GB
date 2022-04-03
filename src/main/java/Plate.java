import java.util.Scanner;

public class Plate {

    public int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("The quantity of food is " + foodQuantity);
    }

    public void decreaseFood(int foodQuantity) {
        this.foodQuantity -= foodQuantity;

        if(foodQuantity < 0) {
            System.out.println("The quantity of food is " + foodQuantity + ". Cat can eat no more."); //task 2
        }
    }

    public void AddFood() {
        System.out.print("Do you want to add some food?"); //task 6
        Scanner inAnswer = new Scanner(System.in);
        String answer = inAnswer.nextLine();

        if (answer == "yes" || answer == "Yes") {
            System.out.print("How much food do you want to add?");
            Scanner inFood = new Scanner(System.in);
            int addFood = inFood.nextInt();

            foodQuantity = foodQuantity + addFood;
        }
    }
}

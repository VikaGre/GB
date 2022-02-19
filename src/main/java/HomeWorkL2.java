import java.util.Scanner;

public class HomeWorkL2 {
    public static void main(String[] args) {

        SumInTheLimit();
    }

    public static boolean SumInTheLimit() {
        System.out.print("Input the first number: ");
        Scanner a = new Scanner(System.in);
        int num_a = a.nextInt();

        System.out.print("Input the second number: ");
        Scanner b = new Scanner(System.in);
        int num_b = b.nextInt();

        if((num_a + num_b >= 10) || (num_a + num_b >= 20)) {
            return true;
        } else {
            return false;
        }
    }
}

import java.util.Scanner;

public class HomeWorkL2 {
    public static void main(String[] args) {

        SumInTheLimit();
        System.out.println();

        PositiveOrNegative();
        System.out.println();

        PositiveOrNegativeB();
        System.out.println();

        PrintString();
        System.out.println();

        LeapYear();
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

    public static void PositiveOrNegative() {
        System.out.print("Input rhe number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num >= 0) {
            System.out.println("It is a positive number.");
        } else {
            System.out.println("It is a negative number.");
        }
    }

    public static boolean PositiveOrNegativeB() {
        System.out.print("Input rhe number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void PrintString() {
        System.out.print("Input the string: ");
        Scanner inputS = new Scanner(System.in);
        String string = inputS.nextLine();

        System.out.print("Input the number: ");
        Scanner inputN = new Scanner(System.in);
        int num = inputN.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.println(string);
        }
    }

    public static boolean LeapYear() {
        System.out.print("Input the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

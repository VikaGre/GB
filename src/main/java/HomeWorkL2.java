import java.util.Scanner;

public class HomeWorkL2 {
    public static void main(String[] args) {

        SumInTheLimit(7, 9);
        System.out.println();

        PositiveOrNegative(5);
        System.out.println();

        PositiveOrNegativeB(-1);
        System.out.println();

        PrintString("Toto", 3);
        System.out.println();

        LeapYear(1111);

        tree();
    }

    public static boolean SumInTheLimit(int a, int b) {
        if((a + b >= 10) && (a + b >= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void PositiveOrNegative(int num) {
        if(num >= 0) {
            System.out.println("It is a positive number.");
        } else {
            System.out.println("It is a negative number.");
        }
    }

    public static boolean PositiveOrNegativeB(int num) {
        if (num >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void PrintString(String string, int num) {
        for(int i = 0; i < num; i++) {
            System.out.println(string);
        }
    }

    public static boolean LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void tree() {
        int rowCount = 6;
        String space = "";
        for(int i = 0; i < rowCount; i++) {
            space = "";
            for(int j = 0; j < rowCount - i - 1; j++) {
                space += " ";
            }
            for(int j = i; j < i + 2; j++) {
                if(i == 0) {
                    space += "*";
                    break;
                } else {
                    for(int n = 1; n < i+1; n++) {
                        space += "*";
                    }
                }
            }
            System.out.println(space);
        }
    }
}

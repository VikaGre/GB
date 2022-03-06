import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    private static char[][] map;
    private static int MAP_SIZE = 5;

    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '•';

    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();


    public static void main(String[] args) {
        Play();
    }

    private static void Map() {
        map = new char[MAP_SIZE][MAP_SIZE];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void Print() {
        for (int i = 0; i < map.length; i++) {
            if (i == 0) {
                System.out.print("  ");
            }
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for(int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Human() {
        int x, y;

        do {
            System.out.print("Input the coordinates X and Y: ");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isCellValid(x, y, DOT_X));
        map[x - 1][y - 1] = DOT_X;

    }

    private static boolean isCellValid(int x, int y, char dot) {
        if (x < 1 || x > MAP_SIZE || y < 1 || y > MAP_SIZE) {
            System.out.println("Exit the size");
            return false;
        }
        boolean check = map[x - 1][y - 1] == DOT_EMPTY;

        if (check) {
            return check;
        } else {
            if (dot == DOT_X) {
                System.out.println("It is busy!");
            }
            return false;
        }
    }

    private static void Computer() {
        int x, y;

        //SmartComputer();

        //if (!SmartComputer()) {
        do {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);

        } while (!isCellValid(x + 1, y + 1, DOT_O));
        map[x][y] = DOT_O;
        //}
    }

    // block
    /*private static boolean SmartComputer() {
        for (int i = 0; i < map.length; i++) {
            if (map[0][i] == DOT_X && map[1][i] == DOT_X) {
                map[2][i] = DOT_O;
            }
        }
        return false;
    }
     */
    /*  for 3

    private static boolean checkWin(int dot) {

        for (int i = 0; i < map.length; i++) {
            if (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot) { // check vertically
                return true;
            }
            if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) { // check horizontally
                return true;
            }
            if ((map[0][0] == dot && map[1][1] == dot && map[2][2] == dot)
            || (map[0][2] == dot && map[1][1] == dot && map[2][0] == dot)) {
                return true;
            }
        }
        return false;
    }
     */

    // for 5
    private static boolean checkWin(int dot) {

        for (int i = 0; i < map.length; i++) {
            if (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot && map[3][i] == dot) { // check vertically
                return true;
            }
            if (map[4][i] == dot && map[1][i] == dot && map[2][i] == dot && map[3][i] == dot) { // check vertically
                return true;
            }
            if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot && map[i][3] == dot) { // check horizontally
                return true;
            }
            if (map[i][4] == dot && map[i][1] == dot && map[i][2] == dot && map[i][3] == dot) { // check horizontally
                return true;
            }
            if ((map[0][0] == dot && map[1][1] == dot && map[2][2] == dot && map[3][3] == dot)
                    || (map[4][4] == dot && map[1][1] == dot && map[2][2] == dot && map[3][3] == dot)
                    || (map[0][4] == dot && map[1][3] == dot && map[2][2] == dot && map[3][1] == dot)
                    || (map[4][0] == dot && map[1][3] == dot && map[2][2] == dot && map[3][1] == dot)) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void Play() {
        Map();
        Print();

        while (true) {
            Human();
            Print();

            if(checkWin(DOT_X)) {
                System.out.println("You win!");
                break;
            }

            if(checkDraw()) {
                System.out.println("Draw!");
                break;
            }

            Computer();
            Print();

            if(checkWin(DOT_O)) {
                System.out.println("Computer wins!");
                break;
            }

            if(checkDraw()) {
                System.out.println("Draw!");
                break;
            }
        }
    }
}

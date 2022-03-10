public class XO {

    private static char[][] map;
    public final static int MAP_SIZE = 3;
    public final static int DOTS_COUNT_TO_WIN = 3;

    private final static char BOD_X = 'X';
    private final static char BOD_O = 'O';
    private final static char DOT_EMPTY = ' ';

    public static void main(String[] args) {
        init();
        print();
    }

    private static void print() {
        for(int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void init() {
        map = new char[MAP_SIZE][MAP_SIZE];
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
}

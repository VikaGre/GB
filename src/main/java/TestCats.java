public class TestCats {

    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        Plate plate = new Plate(100);

        cat[0] = new Cat("Myrsic", 20, 50);
        cat[1] = new Cat("Pyshok", 15, 30);
        cat[2] = new Cat("Lex", 20, 60);

        for (int i = 0; i < cat.length; i++) { //task 5
            plate.info();
            cat[i].eat(plate);
            cat[i].Satiated();
            plate.info();
            plate.AddFood();
        }
    }
}

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Input height dimension: ");
        int h = sc.nextInt();
        System.out.println("Input width dimension: ");
        int w = sc.nextInt();
        Game game = new Game(h,w);
        game.createRandomGame();
        game.generateGameGrid();
        while(true) { game.automaticGame(); }
    }
}

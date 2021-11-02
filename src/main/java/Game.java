public class Game {

    private int gridHeight = 25;
    private int gridWidth = 25;

    public int[][] grid = new int[gridHeight][gridWidth];

    public void generateGameGrid() {
        for (int y=0; y < gridHeight; y++) {
            for (int x=0; x < gridWidth; x++)  {
                if (grid[y][x] == 1) System.out.print("x");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
    public void createEmptyGame() {
        for (int y=0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                grid[y][x] = 0;
            }
        }
        System.out.println(grid);
    }
}

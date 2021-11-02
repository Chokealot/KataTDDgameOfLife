public class Game {

    private int gridHeight = 25;
    private int gridWidth = 25;

    public int[][] grid = new int[gridHeight][gridWidth];

    public void createEmptyGame() {
        for (int y=0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                grid[y][x] = 0;
            }
        }
    }
}

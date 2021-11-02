import java.util.Arrays;

public class Game {

    private int gridHeight;
    private int gridWidth;
    private boolean endGame = false;

    public Game(int gridHeight, int gridWidth) {
        this.gridHeight = gridHeight;
        this.gridWidth = gridWidth;
    }

    public int getGridHeight() {
        return gridHeight;
    }
    public void setGridHeight(int gridHeight) {
        this.gridHeight = gridHeight;
    }
    public int getGridWidth() {
        return gridWidth;
    }
    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }
    public boolean isEndGame() {
        return endGame;
    }
    public void setEndGame(boolean endGame) {
        this.endGame = endGame;
    }

    public int[][] grid;
    public int[][] neighbors;

    public void automaticGame() throws InterruptedException {
        findLife();
        death();
        birth();
        System.out.println();
        generateGameGrid();
        Thread.sleep(1000);
    }
    public void death() {
        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                if (grid[y][x] == 1 && (neighbors[y][x] < 2 || neighbors[y][x] > 3))
                    grid[y][x] = 0;
            }
        }
    }
    public void birth() {
        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                if (grid[y][x] == 0 && neighbors[y][x] == 3)
                    grid[y][x] = 1;
            }
        }
    }
    public void findLife() {
        for (int y = 0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                int count = 0;
                for (int k = -1; k < 2; k++) {
                    if (y + k >= 0 && y + k < gridHeight) {
                        for (int l = -1; l < 2; l++) {
                            if (x + l >= 0 && x + l < gridWidth) {
                                if (!(y+k == y && l+x == x) && grid[y + k][x + l] == 1)
                                    count++;
                            }
                        }
                    }
                }
                neighbors[y][x] = count;
            }
        }
    }
    public void setSpecificNode(int height, int width) {
        if (grid[height][width] == 0) grid[height][width] = 1;
        else grid[height][width] = 0;
    }
    public void generateGameGrid() {
        for (int y=0; y < gridHeight; y++) {
            for (int x=0; x < gridWidth; x++)  {
                if (grid[y][x] == 1) System.out.print("x");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
    public void createRandomGame() {
        initializeGrid();
        for (int y=0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                int rand = (int)(Math.random() * 2) + 0;
                if (rand == 1) { grid[y][x] = 1; }
                else { grid[y][x] = 0; }
            }
        }
    }
    public void createEmptyGame() {
        initializeGrid();
        for (int y=0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                grid[y][x] = 0;
            }
        }
        System.out.println(grid);
    }
    public void initializeGrid() {
        grid = new int[gridHeight][gridWidth];
        neighbors = new int[gridHeight][gridWidth];
    }
}
public class Game {

    private int gridHeight = 25;
    private int gridWidth = 25;

    public int[][] grid = new int[gridHeight][gridWidth];
    public int[][] neighbors = new int[gridHeight][gridWidth];

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
    public void createEmptyGame() {
        for (int y=0; y < gridHeight; y++) {
            for (int x = 0; x < gridWidth; x++) {
                grid[y][x] = 0;
            }
        }
        System.out.println(grid);
    }
}

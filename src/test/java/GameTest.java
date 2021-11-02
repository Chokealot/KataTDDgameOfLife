import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.*;


public class GameTest {

    Game game = new Game();

    int[][] fixed25by25 = new int[25][25];

    @Test
    public void createEmptyGameGrid() {
        assertEquals(fixed25by25, game.grid);
    }
    @Test
    public void shouldReturnZeroFromIndividualCell() {
        assertEquals(0, game.grid[5][5]);
    }
    @Test
    public void shouldNotReturnOneFromIndividualCell() {
        assertNotEquals(1, game.grid[7][2]);
    }

}

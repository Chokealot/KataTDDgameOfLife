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

}

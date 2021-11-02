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
    @Test
    public void ShouldSetSpecificGridNodeToOneFromZero() {
        game.setSpecificNode(3,3);
        assertEquals(1, game.grid[3][3]);
    }
    @Test
    public void SpecificNodeShouldStillNotBeZero() {
        game.setSpecificNode(7,7);
        assertNotEquals(0, game.grid[7][7]);
    }
    @Test
    public void TestForFindLife() {

    }
    @Test
    public void NodeOneByOneShouldStartToLive() {
        game.setSpecificNode(0,0);
        game.setSpecificNode(0,1);
        game.setSpecificNode(1,0);
        game.findLife();
        game.birth();
        assertEquals(1, game.grid[1][1]);
    }
    @Test
    public void NodeOneByOneShouldDieDueToOverpopulation() {
        game.setSpecificNode(0,0);
        game.setSpecificNode(0,1);
        game.setSpecificNode(0,2);
        game.setSpecificNode(1,0);
        game.setSpecificNode(1,1);
        game.findLife();
        game.death();
        assertEquals(0, game.grid[1][1]);
    }
}

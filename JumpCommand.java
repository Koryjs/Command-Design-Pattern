import java.io.FileNotFoundException;
/**
 * @author Kory Singleton
 * Causes the player to jump in-game
 */
public class JumpCommand implements Command{
    private Player player;
    /**
     * Constructor for the JumpCommand class
     * @param player
     */
    public JumpCommand(Player player) {
        this.player = player;
    }
    public void execute() {
        try {
            player.jump();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }       
    }
}


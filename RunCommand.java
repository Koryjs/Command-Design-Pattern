import java.io.FileNotFoundException;
/**
 * @author Kory Singleton
 * Causes the player to run on-game
 */
public class RunCommand implements Command {
    private Player player;
    /**
     * Constructor for the RunCommand class
     * @param player an instance of a player object
     */
    public RunCommand(Player player) {
        this.player = player;
    }
    public void execute() {
        try {
            player.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

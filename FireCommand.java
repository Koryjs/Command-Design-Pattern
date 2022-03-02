import java.io.FileNotFoundException;
/**
 * @author Kory Singleton
 * Causes the player to fire the ingame weapon
 */
public class FireCommand implements Command {
    private Player player;
    /**
     * Default constructor for the FireCommand class
     * @param player a instance of a Player object
     */
    public FireCommand(Player player) {
        this.player = player;
    }
    public void execute() {
        try {
            player.fire();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

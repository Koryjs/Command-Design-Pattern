/**
 * @author Kory Singleton
 * Quits the Program
 */
public class QuitCommand implements Command {
    private Player player;
    /**
     * Constructor for the QuitCommand class
     * @param player an instance of a Player object
     */
    public QuitCommand(Player player) {
        this.player = player;
    }
    public void execute() {
        player.quit();
    }
}

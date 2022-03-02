import java.util.*;
/**
 * @author Kory Singleton
 * Assigns the proper execution depending on what command was entered.
 */
public class InputHandler {
    private HashMap<String, Command> commands;
    /**
     * Constructor for the InputHandler class
     * @param player an instance of a Player object.
     */
    public InputHandler(Player player) {
        commands = new HashMap<>();
        JumpCommand jump = new JumpCommand(player);
        commands.put("jump", jump);
        RunCommand run = new RunCommand(player);
        commands.put("run", run);
        FireCommand fire = new FireCommand(player);
        commands.put("fire", fire);
        QuitCommand quit = new QuitCommand(player);
        commands.put("quit", quit);
    }
    /**
     * Traverses the HashMap to determine the correct command.
     * @param button a String containing a command matching a key in the HashMap.
     */
    public void buttonPressed(String button) {
        Iterator<Map.Entry<String, Command>> iterator = commands.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Command> entry = iterator.next();
            if (button.equals(entry.getKey()))
                entry.getValue().execute();
        }
    }
}

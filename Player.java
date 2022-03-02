import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.*;
/**
 * @author Kory Singleton
 * A maniputable object that houses all the in-game executions for the player
 */
public class Player {
    public Player() {
    }
    /**
     * Reads out file contents to the console to make it appear
     *  like the player is jumping
     * @throws FileNotFoundException
     */
    public void jump() throws FileNotFoundException {
        Scanner sc = new Scanner (new File("jump.txt"));
        int counter = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            counter += 1;
            if (counter == 6) {
                sleep(500);
                clear();
                counter = 0;
            }
        }
    } 
    /**
     * Reads out file contents to the console to make it appear
     * that the player is running.
     * @throws FileNotFoundException
     */
    public void run() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("run.txt"));
        int counter = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            counter += 1;
            if (counter == 3) {
                sleep(500);
                clear();
                counter = 0;
            }
        }
    }
    /**
     * Reads out file contents to the console to make ut appear
     * that the player is firing
     * @throws FileNotFoundException
     */
    public void fire() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("fire.txt"));
        int counter = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            counter += 1;
            if (counter == 3) {
                sleep(500);
                clear();
                counter = 0;
            }
        }
    }
    /**
     * Ends the game
     */
    public void quit() {
        System.out.println("Thanks for playing!");
    }
    /**
     * Causes the system to pause momentarily
     * @param num an int containing the amount of milliseconds that the console should freeze
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e ) {
            System.out.println("Timer error");
        }
    }
    /**
     * Clears the console
     */
    private void clear() {
        System.out.println("\033[H\033[2J");
    }
}

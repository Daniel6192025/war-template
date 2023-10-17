import java.util.Scanner; 
/**
 * War game class
 *
 * @author Mr. Jaffe
 * @version 2022-10-19
 */
public class War
{
    /**
     * Constructor for the game
     * Include your initialization here -- card decks, shuffling, etc
     * Run the event loop after you've done the initializations
     */
    public War()
    {
        // Initializations here
        Deck deck = new Deck();
        deck.initializeNewDeck();
        deck.shuffle();
        Deck[] playerDeck = deck.dealDeck();
        Deck playerOneDeck = playerDeck[0];
        Deck playerTwoDeck = playerDeck[1];
        deck.dealCardFromDeck();
        deck.addCardToDeck();
        
        
        // ...then run the event loop
        this.runEventLoop(playerOneDeck, playerTwoDeck);
    }

    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop(Deck playerOneDeck, Deck playerTwoDeck) {
        boolean playing;
        Scanner users = new Scanner(System.in);
        System.out.println("Please Enter Your Names");
        String playerOne = users.nextLine();
        String playerTwo = users.nextLine();
        System.out.println("Welcome " + playerOne + (" and ") + playerTwo + ("!"));
        while (playing = true) {
            if (playerOneDeck.getDeckSize() == 0) {
                System.out.println(playerTwo + " has won!");
                playing = false;
            } else if (playerOneDeck.getDeckSize() == 52) {
                System.out.println(playerOne + " has won!");
                playing = false;
            } else {
                System.out.println(playerOne + " has dealt the " + playerOneDeck.dealCardFromDeck());
                System.out.println(playerTwo + " has dealt the " + playerOneDeck.dealCardFromDeck());
            }
            
            
        }
    }

    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        War war = new War();
    }

}

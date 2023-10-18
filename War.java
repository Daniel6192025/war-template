import java.util.Scanner; 
import java.util.ArrayList;
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
        Deck playerOneDeck = new Deck();
        Deck playerTwoDeck = new Deck();
        playerOneDeck = playerDeck[0];
        playerTwoDeck = playerDeck[1];

        // ...then run the event loop
        this.runEventLoop(playerOneDeck, playerTwoDeck);
    }

    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop(Deck playerOneDeck, Deck playerTwoDeck) {
        boolean playing;
        boolean war;
        Card playerOneCard = playerOneDeck.dealCardFromDeck();
        Card playerTwoCard = playerTwoDeck.dealCardFromDeck();
        Scanner users = new Scanner(System.in);
        System.out.println("Please Enter Your Names");
        String playerOne = users.nextLine();
        String playerTwo = users.nextLine();
        System.out.println("Welcome " + playerOne + (" and ") + playerTwo + ("!"));
        System.out.println("The game has begun!");
        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
        while (playing = true) {
            if (playerOneDeck.getDeckSize() == 0) {
                System.out.println(playerTwo + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                playing = false;
            } else if (playerOneDeck.getDeckSize() == 52) {
                System.out.println(playerOne + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                playing = false;
            } else {
                System.out.println(playerOne + " has dealt the " + playerOneCard);
                System.out.println(playerTwo + " has dealt the " + playerTwoCard);
                if (playerOneCard.getRank() > playerTwoCard.getRank()) {
                    playerOneDeck.addCardToDeck(playerOneCard);
                    playerOneDeck.addCardToDeck(playerTwoCard);
                    System.out.println(playerOne + " takes all cards!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());

                } else if (playerTwoCard.getRank() > playerOneCard.getRank()) {
                    playerTwoDeck.addCardToDeck(playerOneCard);
                    playerTwoDeck.addCardToDeck(playerTwoCard);
                    System.out.println(playerTwo + " takes all cards!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                } else if (playerOneCard.getRank() == playerOneCard.getRank()){
                    System.out.println("WAR!!!");
                    while (war = true) {
                        ArrayList<Card> warCards = new ArrayList<Card>();
                        warCards.add(playerOneDeck.dealCardFromDeck());
                        warCards.add(playerOneDeck.dealCardFromDeck());
                        warCards.add(playerOneDeck.dealCardFromDeck());
                        warCards.add(playerOneDeck.dealCardFromDeck());
                        warCards.add(playerTwoDeck.dealCardFromDeck());
                        warCards.add(playerTwoDeck.dealCardFromDeck());
                        warCards.add(playerTwoDeck.dealCardFromDeck());
                        warCards.add(playerTwoDeck.dealCardFromDeck());
                        if (warCards.get(3).getRank() > warCards.get(7).getRank()) {
                            playerOneDeck.addCardToDeck(playerOneCard);
                            playerOneDeck.addCardToDeck(playerOneCard);
                            playerOneDeck.addCardToDeck(playerOneCard);
                            playerOneDeck.addCardToDeck(playerOneCard);
                            playerOneDeck.addCardToDeck(playerTwoCard);
                            playerOneDeck.addCardToDeck(playerTwoCard);
                            playerOneDeck.addCardToDeck(playerTwoCard);
                            playerOneDeck.addCardToDeck(playerTwoCard);
                            System.out.println(playerOne + " takes all cards!");
                            System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                            System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                            war = false;
                        } else if (warCards.get(7).getRank() > warCards.get(3).getRank()) {
                            playerTwoDeck.addCardToDeck(playerOneCard);
                            playerTwoDeck.addCardToDeck(playerOneCard);
                            playerTwoDeck.addCardToDeck(playerOneCard);
                            playerTwoDeck.addCardToDeck(playerOneCard);
                            playerTwoDeck.addCardToDeck(playerTwoCard);
                            playerTwoDeck.addCardToDeck(playerTwoCard);
                            playerTwoDeck.addCardToDeck(playerTwoCard);
                            playerTwoDeck.addCardToDeck(playerTwoCard);
                            System.out.println(playerTwo + " takes all cards!");
                            System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                            System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                            war = false;
                        }

                    }

                }
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

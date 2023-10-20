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
<<<<<<< HEAD
=======
        boolean playing;
>>>>>>> 71303b7716666b5b9a070cf4e91d25116cf8a40d
        int roundCount = 0;
        Scanner users = new Scanner(System.in);
        System.out.println("Welcome Players!");
        System.out.println("Please Enter Your Names");
        String playerOne = users.nextLine();
        String playerTwo = users.nextLine();
        System.out.println("Welcome " + playerOne + (" and ") + playerTwo + ("!"));
        System.out.println("The game has begun!");
        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
        System.out.println("---------------------------------------------------------------------");
<<<<<<< HEAD

        while (roundCount < 300) {
            if (playerOneDeck.getDeckSize() > 1 && playerTwoDeck.getDeckSize() > 1){
=======
        while (playing = true) {
            
             if (playerTwoDeck.getDeckSize() == 52) {
                System.out.println(playerTwo + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                System.out.println("Rounds: " + roundCount);
                playing = false;
            } else if (playerOneDeck.getDeckSize() == 52) {
                System.out.println(playerOne + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                System.out.println("Rounds: " + roundCount);
                playing = false;
            } else if (roundCount == 300) {
                playing = false;
                if (playerOneDeck.getDeckSize() > playerTwoDeck.getDeckSize()) {
                    System.out.println(playerTwo + " has won!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                } else if (playerTwoDeck.getDeckSize() > playerOneDeck.getDeckSize()) {
                    System.out.println(playerTwo + " has won!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                } else if (playerTwoDeck.getDeckSize() == playerOneDeck.getDeckSize()){
                    System.out.println("its a tie!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                }
            } else {
>>>>>>> 71303b7716666b5b9a070cf4e91d25116cf8a40d
                roundCount++;
                Card playerOneCard = playerOneDeck.dealCardFromDeck();
                Card playerTwoCard = playerTwoDeck.dealCardFromDeck();
                String cardFaceOne = playerOneCard.getFace();
                String cardSuitOne = playerOneCard.getSuit();
                String cardFaceTwo = playerTwoCard.getFace();
                String cardSuitTwo = playerTwoCard.getSuit();
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                System.out.println(playerOne + " has dealt the " + cardFaceOne + " of " + cardSuitOne);
                System.out.println(playerTwo + " has dealt the " + cardFaceTwo + " of " + cardSuitTwo);
                System.out.println("---------------------------------------------------------------------");
                if (playerOneCard.getRank() > playerTwoCard.getRank()) {
                    playerOneDeck.addCardToDeck(playerOneCard);
                    playerOneDeck.addCardToDeck(playerTwoCard);
                    System.out.println(playerOne + " takes all cards!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                    System.out.println("Rounds: " + roundCount);

                    System.out.println("---------------------------------------------------------------------");
                }  else if (playerTwoCard.getRank() > playerOneCard.getRank()) {
                    playerTwoDeck.addCardToDeck(playerOneCard);
                    playerTwoDeck.addCardToDeck(playerTwoCard);
                    System.out.println(playerTwo + " takes all cards!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                } else if (playerOneCard.getRank() == playerTwoCard.getRank()){
                    System.out.println("WAR!!!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                    ArrayList<Card> warCards = new ArrayList<Card>();
                    warCards.add(playerOneCard);
                    warCards.add(playerOneDeck.dealCardFromDeck());
                    warCards.add(playerOneDeck.dealCardFromDeck());
                    warCards.add(playerOneDeck.dealCardFromDeck());
                    warCards.add(playerOneDeck.dealCardFromDeck());
                    warCards.add(playerTwoCard);
                    warCards.add(playerTwoDeck.dealCardFromDeck());
                    warCards.add(playerTwoDeck.dealCardFromDeck());
                    warCards.add(playerTwoDeck.dealCardFromDeck());
                    warCards.add(playerTwoDeck.dealCardFromDeck());
                    String warP1Face = warCards.get(4).getFace();
                    String warP1Suit = warCards.get(4).getSuit();
                    String warP2Face = warCards.get(9).getFace();
                    String warP2Suit = warCards.get(9).getSuit();
                    System.out.println("---------------------------------------------------------------------");
                    if (warCards.get(4).getRank() > warCards.get(9).getRank()) {
                        playerOneDeck.addCardToDeck(warCards.get(0));
                        playerOneDeck.addCardToDeck(warCards.get(1));
                        playerOneDeck.addCardToDeck(warCards.get(2));
                        playerOneDeck.addCardToDeck(warCards.get(3));
                        playerOneDeck.addCardToDeck(warCards.get(4));
                        playerOneDeck.addCardToDeck(warCards.get(5));
                        playerOneDeck.addCardToDeck(warCards.get(6));
                        playerOneDeck.addCardToDeck(warCards.get(7));
<<<<<<< HEAD
                        playerOneDeck.addCardToDeck(warCards.get(8));
                        playerOneDeck.addCardToDeck(warCards.get(9));
                        System.out.println(playerOne + " has dealt the " + warP1Face + " of " + warP1Suit);
                        System.out.println(playerTwo + " has dealt the " + warP2Face + " of " + warP2Suit);
=======
                        System.out.println(playerOne + " has dealt the " + warCards.get(3));
                        System.out.println(playerTwo + " has dealt the " + warCards.get(7));
>>>>>>> 71303b7716666b5b9a070cf4e91d25116cf8a40d
                        System.out.println(playerOne + " takes all cards!");
                        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                        System.out.println("Rounds: " + roundCount);
                        System.out.println("---------------------------------------------------------------------");
                    } else if (warCards.get(9).getRank() > warCards.get(4).getRank()){ 
                        playerTwoDeck.addCardToDeck(warCards.get(0));
                        playerTwoDeck.addCardToDeck(warCards.get(1));
                        playerTwoDeck.addCardToDeck(warCards.get(2));
                        playerTwoDeck.addCardToDeck(warCards.get(3));
                        playerTwoDeck.addCardToDeck(warCards.get(4));
                        playerTwoDeck.addCardToDeck(warCards.get(5));
                        playerTwoDeck.addCardToDeck(warCards.get(6));
                        playerTwoDeck.addCardToDeck(warCards.get(7));
<<<<<<< HEAD
                        playerTwoDeck.addCardToDeck(warCards.get(8));
                        playerTwoDeck.addCardToDeck(warCards.get(9));
                        System.out.println(playerOne + " has dealt the " + warP1Face + " of " + warP1Suit);
                        System.out.println(playerTwo + " has dealt the " + warP2Face + " of " + warP2Suit);
=======
                        System.out.println(playerOne + " has dealt the " + warCards.get(3));
                        System.out.println(playerTwo + " has dealt the " + warCards.get(7));
>>>>>>> 71303b7716666b5b9a070cf4e91d25116cf8a40d
                        System.out.println(playerTwo + " takes all cards!");
                        System.out.println("Rounds: " + roundCount);
                        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                        System.out.println("---------------------------------------------------------------------");

                    } else if (playerOneDeck.getDeckSize() < 4) {
                        System.out.println(playerTwo + " has won!");
                        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                        System.out.println("Rounds: " + roundCount);

                    } else if (playerTwoDeck.getDeckSize() < 4 ) {
                        System.out.println(playerOne + " has won!");
                        System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                        System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                        System.out.println("Rounds: " + roundCount);

                    }
                }      
            } 
            if (roundCount == 300) {
                System.out.println("the game has ended!");
                if (playerOneDeck.getDeckSize() > playerTwoDeck.getDeckSize()) {
                    System.out.println(playerOne + " has won!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                } else if (playerTwoDeck.getDeckSize() > playerOneDeck.getDeckSize()) {
                    System.out.println(playerTwo + " has won!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                } else if (playerTwoDeck.getDeckSize() == playerOneDeck.getDeckSize()){
                    System.out.println("its a tie!");
                    System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                    System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                    System.out.println("Rounds: " + roundCount);
                    System.out.println("---------------------------------------------------------------------");
                }
            } else if (playerTwoDeck.getDeckSize() == 52 || playerOneDeck.getDeckSize() == 0) {
                System.out.println(playerTwo + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize()); 
                System.out.println("Rounds: " + roundCount);

            } else if (playerOneDeck.getDeckSize() == 52 || playerTwoDeck.getDeckSize() == 0) {
                System.out.println(playerOne + " has won!");
                System.out.println(playerOne + ": " + playerOneDeck.getDeckSize());
                System.out.println(playerTwo + ": " + playerTwoDeck.getDeckSize());
                System.out.println("Rounds: " + roundCount);

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
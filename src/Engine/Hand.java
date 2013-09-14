package Engine;

/**
 * User: AnubhawArya
 * Date: 9/13/13
 * Time: 3:00 PM
 */
public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    // Constructur
    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    // Called when player wants to hit
    public void addCard(Card card) {
        cards.add(card);
    }

    // Returns an array of length 1 or 2 containing possible values of the hand
    public array getValues() {
        int val0 = 0; // Hand value assuming first ace is valued at 1
        int val1 = 0; // Hand value assuming first ace is valued at 11
        boolean hasAce = false;

        for(int i=0; i<cards.size(); i++) {
            cardValue = cards[i].getValues();

            // If Ace
            if(cardValue.length == 2) {
                // If Ace already exists in hand, just add 1
                if(hasAce) {
                    val0 += cardValue[0]; // 1
                    val1 += cardValue[0]; // 1
                }
                else {
                    val0 += cardValue[0]; // 1
                    val2 += cardValue[1]; // 11
                    hasAce = true;
                }
            }

            // Otherwise single-value cards (2-10, J, Q, K)
            else {
                val0 += cardValue[0];
                val1 += cardValue[0];
            }
        }

        if(val0 == val1) {
            return [val0]
        }
        else {
            return [val0, val1]
        }
    }

    // TODO
   public Hand split() {
        return Null unless cards.size() == 2;

   }
}

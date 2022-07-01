package WorkingWithAbstractionExecises.cardsWithPower;

public class Card {
    private CardSuits cardSuits;
    private CardRank cardRank;

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public void setCardSuits(CardSuits cardSuits) {
        this.cardSuits = cardSuits;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public Card(CardSuits cardSuits, CardRank cardRank) {
        this.cardSuits = cardSuits;
        this.cardRank = cardRank;
    }
    public int getPower(){
        return cardRank.getRankPower() + cardSuits.getSuitPower();
    }
}

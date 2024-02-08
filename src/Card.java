import java.util.Objects;

public class Card {
    private int cardNumber;
    private int cvv;
    private double currentAmount;

    public Card(int cardNumber, int cvv, double currentAmount) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.currentAmount = currentAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardNumber == card.cardNumber && cvv == card.cvv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, cvv);
    }
}

import java.util.Arrays;

public class Client {
    private String name;
    private String surName;
    private Card[] cards;

    public Client(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void addCard(Card card) {
        if (this.cards == null) {
            cards = new Card[1];
            cards[0] = card;
        } else {
            cards = Arrays.copyOf(cards, cards.length + 1);
            cards[cards.length - 1] = card;
        }
    }

    @Override
    public String toString() {
        if (this.cards == null) {
            return "у клиента '" + this.name + " " + this.surName + "' нет карт\n";
        } else if (calculateSameCards() == 0) {
            return "у клиента '" + this.name + " " + this.surName + "' нет одинаковых карт\n";
        } else {
            return "Клиент: " + name + " " + surName + "\nколичество одинаковых карт: " + calculateSameCards() + "\n";
        }
    }

    private int calculateSameCards() {
        int sameCardCount = 0;
        for (int i = 0; i < this.cards.length; i++) {
            for (int j = 0; j < this.cards.length; j++) {
                if (this.cards[i].equals(this.cards[j]) && i != j) {
                    sameCardCount++;
                }
            }
        }
        return sameCardCount;
    }
}

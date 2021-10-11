package labs.exCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Card implements Comparable<Card> {
    char suit;
    String  values;

    public Card(char suit, String values) {
        this.suit = suit;
        this.values = values;
    }

    public Card(){}
    public static void main(String[] args) {
        Card cards = new Card();
        cards.setSuit('t');
        cards.setValues("12");
        Card card2 = new Card();
        card2.setSuit('t');
        card2.setValues("12");



        Card[] cardArr  = new Card[3];
        cardArr[0] = new Card('r',"esi");
        cardArr[1] = new Card('y',"12");
        cardArr[2] = new Card('e',"Masa");
        Arrays.sort(cardArr,Card.CardStringComparator);
        for (Card c : cardArr){
            System.out.println(c);
        }
        System.out.println("cards equals card 2 : "+cards.equals(card2));

        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(cards);
        cardArrayList.add(card2);






    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return getSuit() == card.getSuit() && getValues().equals(card.getValues());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuit(), getValues());
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", values='" + values + '\'' +
                '}';
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }


    //integer comparator
    @Override
    public int compareTo(Card o) {
        return this.getSuit()-o.getSuit();
    }


    //String comparator
    public static Comparator<Card> CardStringComparator =new Comparator<Card>() {
        @Override
        public int compare(Card o1, Card o2) {
            return o1.getValues().compareTo(o2.values);
        }
    };
}

package jc1_homework.fifth.card_t33;

public class Main {
    public static void main(String[] args) {
        Golden_card golden_card = new Golden_card();
        Silver_card silver_card = new Silver_card();
        Bronze_card bronze_card = new Bronze_card();
        active_card(golden_card);
        active_card(silver_card);
        active_card(bronze_card);
    }


    public static void active_card(Card card) {
        card.activeCard();
    }

    public static void blocked_card(Card card) {
        card.blockedCard();
    }
}

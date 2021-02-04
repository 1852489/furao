package demo.entity;

public class Card_order {
    int card_order;
    String card_id;

    public Card_order(int card_order, String card_id) {
        this.card_order = card_order;
        this.card_id = card_id;
    }

    public int getCard_order() {
        return card_order;
    }

    public void setCard_order(int card_order) {
        this.card_order = card_order;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }
}

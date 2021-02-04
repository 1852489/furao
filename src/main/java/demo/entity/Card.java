package demo.entity;

public class Card {
    String card_id;
    String name;
    int pay;
    int kind;

    public Card(String card_id, String name, int pay, int kind) {
        this.card_id = card_id;
        this.name = name;
        this.pay = pay;
        this.kind = kind;
    }

    public String getCard_id() {
        return card_id;
    }

    public String getName() {
        return name;
    }

    public int getPay() {
        return pay;
    }

    public int getKind() {
        return kind;
    }
}

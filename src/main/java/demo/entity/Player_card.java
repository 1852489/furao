package demo.entity;

public class Player_card {
    String player_id;
    String card_id;
    int order;

    public Player_card(String player_id, String card_id, int order) {
        this.player_id = player_id;
        this.card_id = card_id;
        this.order = order;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

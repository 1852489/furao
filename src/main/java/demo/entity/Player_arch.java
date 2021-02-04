package demo.entity;

public class Player_arch {
    String player_id;
    String arch_id;
    int order;

    public Player_arch(String player_id, String arch_id, int order) {
        this.player_id = player_id;
        this.arch_id = arch_id;
        this.order = order;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getArch_id() {
        return arch_id;
    }

    public void setArch_id(String arch_id) {
        this.arch_id = arch_id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}

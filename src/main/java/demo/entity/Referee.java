package demo.entity;

public class Referee {
    String id="1";
    int crown_num;
    int heap_first;
    int heap_last;
    int player_num=0;
    int state=0;
    int state_order=0;

    public int getPlayer_num() {
        return player_num;
    }

    public void setPlayer_num(int player_num) {
        this.player_num = player_num;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState_order() {
        return state_order;
    }

    public void setState_order(int state_order) {
        this.state_order = state_order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Referee(String id, int crown_num, int heap_first, int heap_last) {
        this.id=id;
        this.crown_num = crown_num;
        this.heap_first = heap_first;
        this.heap_last = heap_last;
    }
    public Referee(int crown_num, int heap_first, int heap_last) {
        this.crown_num = crown_num;
        this.heap_first = heap_first;
        this.heap_last = heap_last;
    }

    public int getCrown_num() {
        return crown_num;
    }

    public void setCrown_num(int crown_num) {
        this.crown_num = crown_num;
    }

    public int getHeap_first() {
        return heap_first;
    }

    public void setHeap_first(int heap_first) {
        this.heap_first = heap_first;
    }

    public int getHeap_last() {
        return heap_last;
    }

    public void setHeap_last(int heap_last) {
        this.heap_last = heap_last;
    }
}

package demo.entity;

public class User {
    String user_id;
    String name;
    int match_sum=0;
    int match_win=0;

    public User(String user_id, String name) {
        this.user_id = user_id;
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatch_sum() {
        return match_sum;
    }

    public void setMatch_sum(int match_sum) {
        this.match_sum = match_sum;
    }
    public void addMatch_sum() {
        this.match_sum++;
    }

    public int getMatch_win() {
        return match_win;
    }

    public void setMatch_win(int match_win) {
        this.match_win = match_win;
    }
    public void addMatch_win() {
        this.match_win++;
    }


}

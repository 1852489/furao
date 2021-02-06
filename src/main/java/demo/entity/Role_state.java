package demo.entity;

public class Role_state {
    String role_id;
    int left=1;

    public Role_state(String role_id, int left) {
        this.role_id = role_id;
        this.left = left;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}

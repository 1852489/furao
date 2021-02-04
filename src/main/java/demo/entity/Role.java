package demo.entity;

public class Role {
    String role_id;
    String name;
    int order;
    int skill;

    public Role(String role_id, String name, int order, int skill) {
        this.role_id = role_id;
        this.name = name;
        this.order = order;
        this.skill = skill;
    }

    public String getRole_id() {
        return role_id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public int getSkill() {
        return skill;
    }
}

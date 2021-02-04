package demo.controller;

public class user {
    public user(Integer id, String name, Integer old, double grade) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.grade = grade;
    }

    private Integer id;
    private String name;
    private Integer old;
    private double grade;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOld() {
        return old;
    }

    public void setOld(Integer old) {
        this.old = old;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }


}

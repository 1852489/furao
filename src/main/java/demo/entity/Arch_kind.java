package demo.entity;

public class Arch_kind {
    int noble;
    int religious;
    int trade;
    int miltary;
    int unique;

    public Arch_kind(int noble, int religious, int trade, int miltary, int unique) {
        this.noble = noble;
        this.religious = religious;
        this.trade = trade;
        this.miltary = miltary;
        this.unique = unique;
    }

    public int getNoble() {
        return noble;
    }

    public void setNoble(int noble) {
        this.noble = noble;
    }

    public int getReligious() {
        return religious;
    }

    public void setReligious(int religious) {
        this.religious = religious;
    }

    public int getTrade() {
        return trade;
    }

    public void setTrade(int trade) {
        this.trade = trade;
    }

    public int getMiltary() {
        return miltary;
    }

    public void setMiltary(int miltary) {
        this.miltary = miltary;
    }

    public int getUnique() {
        return unique;
    }

    public void setUnique(int unique) {
        this.unique = unique;
    }
}

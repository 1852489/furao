package demo.entity;

public class Player {
    String player_id;
    String name;
    //卡牌数
    int card_num=0;
    //金币
    int money=0;
    //本局顺序号，跟王冠顺序发放有关
    int order;
    //是否是国王
    boolean isking=false;
    //当前积分，不包括特殊加分
    int point=0;
    //角色id，每局都会改变
    String role_id;
    //各种种类的建筑数目
    int noble=0;
    int religious=0;
    int trade=0;
    int miltary=0;
    int unique=0;

    public Player(String player_id, String name, int order) {
        this.player_id = player_id;
        this.name = name;
        this.order = order;
    }
    //重写
    public Player(String player_id, String name) {
        this.player_id = player_id;
        this.name = name;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCard_num() {
        return card_num;
    }

    public void setCard_num(int card_num) {
        this.card_num = card_num;
    }
    public void addCard(int n){
        this.card_num=this.card_num+n;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void addMoney(int n){
        this.money=this.money+n;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isking() {
        return isking;
    }

    public void setIsking(boolean isking) {
        this.isking = isking;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public void addPoint(int n){
        this.point=this.point +n;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public int getNoble() {
        return noble;
    }

    public void setNoble(int noble) {
        this.noble = noble;
    }
    public void addNoble(int n){
        this.noble=this.noble+n;
    }

    public int getReligious() {
        return religious;
    }

    public void setReligious(int religious) {
        this.religious = religious;
    }
    public void addReligious(int n){
        this.religious=this.religious+n;
    }

    public int getTrade() {
        return trade;
    }

    public void setTrade(int trade) {
        this.trade = trade;
    }
    public void addTrade(int n){
        this.trade=this.trade+n;
    }

    public int getMiltary() {
        return miltary;
    }

    public void setMiltary(int miltary) {
        this.miltary = miltary;
    }
    public void addMiltary(int n){
        this.miltary=this.miltary+n;
    }

    public int getUnique() {
        return unique;
    }

    public void setUnique(int unique) {
        this.unique = unique;
    }
    public void addUnique(int n){
        this.unique=this.unique+n;
    }
}

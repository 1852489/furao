package demo.mapper;
import demo.entity.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface PlayerMapper {
    @Insert("insert into player values(#{player_id},#{name},#{card_num}," +
            "#{money},#{order},#{isking},#{point},#{role_id},#{noble},#{religious},#{trade},#{miltary},#{unique})")
    void addPlayer(Player player1);
    @Update("update player set card_num=#{card_num},money=#{money},`order`=#{order},isking=#{isking}," +
            "point=#{point},role_id=#{role_id},noble=#{noble},religious=#{religious}," +
            "trade=#{trade},miltary=#{miltary},`unique`=#{unique} where player_id=#{player_id}")
    void updatePlayer(Player player1);
    @Select("select * from player where player_id=#{id}")
    //card_num,money,`order`,isking,point,role_id,noble,religious,trade,miltary,`unique`
    Player getPlayer(String id);
    @Select("select name from player where player_id=#{id}")
    String getName(String id);
    @Select("select isking from player where player_id=#{id}")
    int getIsking(String id);
    @Update("set player set isking=#{n} where player_id=#{id}")
    void updateIsking(String id,int n);
    @Select("select card_num from player where player_id=#{id}")
    int getCardnum(String id);
    @Update("update player set card_num=#{num} where player_id=#{id}")
    void updateCardnum(String id,int num);
    @Select("select `order` from player where player_id=#{id}")
    int getOrder(String id);
    @Select("select money from player where player_id=#{id}")
    int getMoney(String id);
    @Update("update player set money=#{num} where player_id=#{id}")
    void updateMoney(String id,int num);

    @Update("update player set `order`=#{order} where player_id=#{id}")
    void updateOrder(String id,int order);
    @Select("select point from player where player_id=#{id}")
    int getPoint(String id);
    @Update("update player set point=#{point} where player_id=#{id}")
    void updatePoint(String id,int point);
    @Select("select role_id from player where player_id=#{id}")
    int getRoleid(String id);
    @Update("update player set role_id=#{role_id} where player_id=#{id}")
    void updateRoleid(String id,String role_id);
    @Select("select noble,religious,trade,miltary,`unique` from player where player_id=#{id}")
    Arch_kind getArchnum(String id);
    @Select("select noble from player where player_id=#{id}")
    int getNoble(String id);
    @Update("update player set noble=#{num} where player_id=#{id}")
    void updateNoble(String id,int num);
    @Select("select religious from player where player_id=#{id}")
    int getReligious(String id);
    @Update("update player set religious=#{num} where player_id=#{id}")
    void updateReligious(String id,int num);
    @Select("select trade from player where player_id=#{id}")
    int getTrade(String id);
    @Update("update player set trade=#{num} where player_id=#{id}")
    void updateTrade(String id,int num);
    @Select("select miltary from player where player_id=#{id}")
    int getMiltary(String id);
    @Update("update player set miltary=#{num} where player_id=#{id}")
    void updateMiltary(String id,int num);
    @Select("select `unique` from player where player_id=#{id}")
    int getUnique(String id);
    @Update("update player set `unique`=#{num} where player_id=#{id}")
    void updateUnique(String id,int num);

    @Insert("insert into player_arch values(#{player_id},{arch_id},{order})")
    void insertArch(Player_arch playerArch);
    @Delete("delete from player_arch where `order`=#{order}")
    void deleteArch(int order);
    @Select("select * from player_arch")
    ArrayList<Player_arch> getallArch();

    @Insert("insert into player_card values(#{player_id},#{card_id},#{order})")
    void insertCard(Player_card playerCard);
    @Delete("delete from player_card where `order`=#{order}")
    void deleteCard(int order);
    @Select("select * from player_card")
    ArrayList<Player_card> getallCard();
}

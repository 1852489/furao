package demo.mapper;
import demo.entity.Referee;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface RefereeMapper {
    @Insert("insert into referee values(#{id},#{crown_num},#{heap_first},#{heap_last},#{player_num},#{state},#{state_order})")
    void insertReferee(Referee ref);
    @Select("select crown_num from referee where id=#{id}")
    int getCrown(String id);
    @Update("update referee set crown_num=#{n} where id=#{id}")
    void updateCrown(String id,int n);
    @Select("select heap_first from referee where id=#{id}")
    int getHeapfirst(String id);
    @Update("update referee set heap_first=#{n} where id=#{id}")
    void updateHeapfirst(String id,int n);
    @Select("select heap_last from referee where id=#{id}")
    int getHeaplast(String id);
    @Update("update referee set heap_last=#{n} where id=#{id}")
    void updateHeaplast(String id,int n);
    @Select("select player_num from referee where id=#{id}")
    int getPlayernum(String id);
    @Update("update referee set player_num=#{n} where id=#{id}")
    void updatePlayernum(String id,int n);
    @Select("select state from referee where id=#{id}")
    int getState(String id);
    @Update("update referee set state=#{n} where id=#{id}")
    void updateState(String id,int n);
    @Select("select state_order from referee where id=#{id}")
    int getStateorder(String id);
    @Update("update referee set state_order=#{n} where id=#{id}")
    void updateStateorder(String id,int n);
}

package demo.mapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface DeleteallMapper {
    @Delete("delete from card_heap")
    void deleteCardorder();
    @Delete("delete from player")
    void deletePlayer();
    @Delete("delete from player_arch")
    void deletePlayerarch();
    @Delete("delete from player_card")
    void deletePlayercard();
    @Delete("delete from referee")
    void deleteReferee();

}

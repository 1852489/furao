package demo.mapper;

import demo.entity.Card;
import demo.entity.Card_order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper

public interface CardMapper {
    @Select("select * from card")
    ArrayList<Card> getallCard();
    @Select("select * from card where id=#{id}")
    Card getbyId(String id);

    @Select("select * from card_heap where card_order=#{order}")
    Card_order getFirstcard(int order);
    @Delete("delete from card_heap where card_order=#{order}")
    void deleteFirstcard(int order);
    @Insert("insert into card_heap values(#{card_order},#{card_id})")
    void insertLastcard(Card_order cardorder1);
}

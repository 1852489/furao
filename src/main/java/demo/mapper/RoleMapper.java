package demo.mapper;
import demo.entity.Card;
import demo.entity.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface RoleMapper {
    @Select("select * from role")
    ArrayList<Role> getallRole();
    @Select("select * from role where id=#{id}")
    Card getbyId(String id);
    @Select("select skill from role where id=#{id}")
    Role getSkill(String id);
}

package demo.mapper;
import demo.entity.Card;
import demo.entity.Role;
import demo.entity.Role_state;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface RoleMapper {
    @Select("select * from role")
    ArrayList<Role> getallRole();
    @Select("select * from role where role_id=#{id}")
    Card getbyId(String id);
    @Select("select skill from role where role_id=#{id}")
    Role getSkill(String id);

    @Select("select * from role_state where role_id=#{id}")
    Role_state getRolestate(String id);
    @Update("update role_state set `left`=#{n} where role_id=#{id}")
    void updateRoleleft(String id,int n);
    @Insert("insert into role_state values(#{id},#{n})")
    void insertRolestate(String id,int n);
    @Select("select `left` from role_state where role_id=#{id}")
    int getRoleleft(String id);
    @Delete("delete from role_state")
    void deleteRolestate();
}

package demo.controller;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface usermapper {
    String hello();
    @Select("select old,grade from student where id=#{id}")
    old_grade selectOldgrade(int id);
    @Select("select * from student where id=#{id}")
    user selectbyid(Integer id);
    @Select("select * from student")
    ArrayList<user> selectall();
}

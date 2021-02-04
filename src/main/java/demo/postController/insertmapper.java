package demo.postController;
import demo.controller.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface insertmapper {
    @Insert("insert into student values(#{id},#{name},#{old},#{grade})")
    void insert1(user user1);
    @Insert("insert into student values(#{id},#{name},#{old},#{grade})")
    void insert(int id,String name,int old,double grade);
    @Update("update student set name=#{id},old=#{old},grade=#{grade} where id=#{id}")
    void update(int id,String name,int old,double grade);
    @Delete("delete from student where id=#{id}")
    void deletestudent(int id);

}

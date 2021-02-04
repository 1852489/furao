package demo.postController;
import demo.controller.user;
import demo.controller.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class insertstudent {
    @Autowired
    private insertmapper mapper;
    @RequestMapping("/insert")
    public void insert(int id,String name,int old,double grade) {
        mapper.insert(id,name,old,grade);
    }
    @RequestMapping("/insert1")
    @ResponseBody
    public void insert(@RequestBody Map<String,Object> map) {

        int id= (int) map.get("id");
        String name=map.get("name").toString();
        int old=(int)map.get("old");
        int grate1=(int)map.get("grade");
        double grate=(double)grate1;
        user user1= new user(id,name,old,grate);
        mapper.insert1(user1);
    }
    @RequestMapping("/delete")
    @ResponseBody
    public void deleteStudent(int id) {
        mapper.deletestudent(id);
    }
    public void deleteStudent() {
        mapper.deletestudent(7);
    }
}

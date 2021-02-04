package demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class usercontroller {
    @Autowired
    private usermapper mapper;
    @ResponseBody
    @RequestMapping("/get/{id}")
    public Object getById(@PathVariable Integer id){
        user user1=mapper.selectbyid(id);
        System.out.println(user1.getName());
        return user1;
    };
    @ResponseBody
    @RequestMapping("/getOldgrade")
    public Object getOldgrade(Integer id){

        return mapper.selectOldgrade(id);
    };
    @ResponseBody
    @RequestMapping("/getall")
    public Object getall(){
        return mapper.selectall();
    };

}

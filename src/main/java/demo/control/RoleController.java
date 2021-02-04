package demo.control;
import demo.mapper.CardMapper;
import demo.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleMapper rolemapper;
    @ResponseBody
    @RequestMapping("/getall")
    public Object getallRole(){

        return rolemapper.getallRole();
    };
    @ResponseBody
    @RequestMapping("/getbyId")
    public Object getbyId(String id){
        return rolemapper.getbyId(id);
    }
    @ResponseBody
    @RequestMapping("/getSkill")
    public Object getSkill(String id){

        return rolemapper.getSkill(id);
    }

}

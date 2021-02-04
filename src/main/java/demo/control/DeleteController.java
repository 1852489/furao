package demo.control;
import demo.mapper.DeleteallMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/delete")
public class DeleteController {
    @Autowired
    private DeleteallMapper deleteallmapper;
    @ResponseBody
    @RequestMapping("/deleteCardorder")
    public void deleteCardorder(){
        deleteallmapper.deleteCardorder();
    };
    @ResponseBody
    @RequestMapping("/deletePlayer")
    public void deletePlayer(){
        deleteallmapper.deletePlayer();
    };
    @ResponseBody
    @RequestMapping("/deletePlayerarch")
    public void deletePlayerarch(){
        deleteallmapper.deletePlayerarch();
    };
    @ResponseBody
    @RequestMapping("/deletePlayercard")
    public void deletePlayercard(){
        deleteallmapper.deletePlayercard();
    };
    @ResponseBody
    @RequestMapping("/deleteReferee")
    public void deleteReferee(){
        deleteallmapper.deleteReferee();
    };



}

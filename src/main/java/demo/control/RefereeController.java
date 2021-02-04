package demo.control;
import demo.entity.Player;
import demo.entity.Referee;
import demo.mapper.PlayerMapper;
import demo.mapper.RefereeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/referee")
public class RefereeController {
    @Autowired
    private RefereeMapper refereeMapper;
    @ResponseBody
    @RequestMapping("/insertReferee")
    public void insertReferee(@RequestBody Map<String,Object> map){
        int crown=(int)map.get("crown_num");
        int heapfirst=(int)map.get("heap_first");
        int heaplast=(int)map.get("heap_last");
        Referee ref=new Referee(crown,heapfirst,heaplast);
        refereeMapper.insertReferee(ref);
    };
    @ResponseBody
    @RequestMapping("/getCrown")
    public int getCrown(String id){
       return refereeMapper.getCrown(id);
    };
    public int getCrown(){
        return refereeMapper.getCrown("1");
    };
    @ResponseBody
    @RequestMapping("/updateCrown")
    public void updateCrown(String id,int n){
        refereeMapper.updateCrown(id,n);
    };
    @ResponseBody
    @RequestMapping("/getHeapfirst")
    public int getHeapfirst(String id){
        return refereeMapper.getHeapfirst(id);
    };
//    public int getHeapfirst(){
//        return refereeMapper.getHeapfirst("1");
//    };
    @ResponseBody
    @RequestMapping("/updateHeapfirst")
    public void updateHeapfirst(String id,int n){
        refereeMapper.updateHeapfirst(id,n);
    };
    @ResponseBody
    @RequestMapping("/getHeaplast")
    public int getHeaplast(String id){
        return refereeMapper.getCrown(id);
    };
//    public int getHeaplast(){
//        return refereeMapper.getHeaplast("1");
//    };
    @ResponseBody
    @RequestMapping("/updateHeaplast")
    public void updateHeaplast(String id,int n){
        refereeMapper.updateHeaplast(id,n);
    };
    @ResponseBody
    @RequestMapping("/getPlayernum")
    public int getPlayernum(String id){
        return refereeMapper.getPlayernum(id);
    };

    @ResponseBody
    @RequestMapping("/updatePlayernum")
    public void updatePlayernum(String id,int n){
        refereeMapper.updatePlayernum(id,n);
    };
    @ResponseBody
    @RequestMapping("/getState")
    public int getState(String id){
        return refereeMapper.getState(id);
    };

    @ResponseBody
    @RequestMapping("/updateState")
    public void updateState(String id,int n){
        refereeMapper.updateState(id,n);
    };
    @ResponseBody
    @RequestMapping("/getStateorder")
    public int getStateorder(String id){
        return refereeMapper.getStateorder(id);
    };

    @ResponseBody
    @RequestMapping("/updateStateorder")
    public void updateStateorder(String id,int n){
        refereeMapper.updateStateorder(id,n);
    };


}

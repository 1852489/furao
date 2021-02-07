package demo.control;
import demo.entity.Player;
import demo.entity.Player_arch;
import demo.entity.Player_card;

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
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerMapper playermapper;
    @Autowired
    private RefereeMapper refereeMapper;
    @ResponseBody
    @RequestMapping("/addPlayer")
    public void addPlayer(@RequestBody Map<String,Object> map){
        String player_id=map.get("player_id").toString();
        String name=map.get("name").toString();
        int order=(int)map.get("order");
        Player player1=new Player(player_id,name,order);
        playermapper.addPlayer(player1);
       // int playrnum=refereeMapper.getPlayernum("1");
       // refereeMapper.updatePlayernum("1",playrnum+1);
    };
    @ResponseBody
    @RequestMapping("/getPlayer")
    public Object getPlayer(String id){
        return playermapper.getPlayer(id);
    }
    @ResponseBody
    @RequestMapping("/getName")
    public Object getName(String id){
        return playermapper.getName(id);
    }
    @ResponseBody
    @RequestMapping("/getIsking")
    public int getIsking(String id){
        return playermapper.getIsking(id);
    }
    @ResponseBody
    @RequestMapping("/updateIsking")
    public void updateIsking(String id,int n){
        playermapper.updateCardnum(id,n);
    }
    @ResponseBody
    @RequestMapping("/getCardnum")
    public int getCardnum(String id){
        return playermapper.getCardnum(id);
    }
    @ResponseBody
    @RequestMapping("/updateCardnum")
    public void updateCardnum(String id,int num){
        playermapper.updateCardnum(id,num);
    }
    @ResponseBody
    @RequestMapping("/getMoney")
    public int getMoney(String id){
        return playermapper.getMoney(id);
    }
    @ResponseBody
    @RequestMapping("/updateMoney")
    public void updateMoney(String id,int num){
        playermapper.updateMoney(id,num);
    }
    @ResponseBody
    @RequestMapping("/getOrder")
    public int getOrder(String id){
        return playermapper.getOrder(id);
    }
    @ResponseBody
    @RequestMapping("/updateOrder")
    public void updateOrder(String id,int num){
        playermapper.updateOrder(id,num);
    }
    @ResponseBody
    @RequestMapping("/getPoint")
    public int getPoint(String id){
        return playermapper.getPoint(id);
    }
    @ResponseBody
    @RequestMapping("/updatePoint")
    public void updatePoint(String id,int num){
        playermapper.updatePoint(id,num);
    }
    @ResponseBody
    @RequestMapping("/getRoleid")
    public int getRoleid(String id){
        return playermapper.getRoleid(id);
    }
    @ResponseBody
    @RequestMapping("/updateRoleid")
    public void updateRoleid(String id,String role_id){
        playermapper.updateRoleid(id,role_id);
    }
    @ResponseBody
    @RequestMapping("/getArchnum")
    public Object getArchnum(String id){
        return playermapper.getArchnum(id);
    }
    @ResponseBody
    @RequestMapping("/getNoble")
    public Object getNoble(String id){
        return playermapper.getNoble(id);
    }
    @ResponseBody
    @RequestMapping("/updateNoble")
    public void updateNoble( String id,int num){
        playermapper.updateNoble(id,num);
    }
    @ResponseBody
    @RequestMapping("/getTrade")
    public Object getTrade(String id){
        return playermapper.getTrade(id);
    }
    @ResponseBody
    @RequestMapping("/updateReligious")
    public void updateReligious( String id,int num){
        playermapper.updateReligious(id,num);
    }
    @ResponseBody
    @RequestMapping("/getReligious")
    public Object getReligious(String id){
        return playermapper.getReligious(id);
    }
    @ResponseBody
    @RequestMapping("/updateTrade")
    public void updateTrade( String id,int num){
        playermapper.updateTrade(id,num);
    }
    @ResponseBody
    @RequestMapping("/getMiltary")
    public Object getMiltary(String id){
        return playermapper.getMiltary(id);
    }
    @ResponseBody
    @RequestMapping("/updateMiltary")
    public void updateMiltary( String id,int num){
        playermapper.updateMiltary(id,num);
    }
    @ResponseBody
    @RequestMapping("/getUnique")
    public Object getUnique(String id){
        return playermapper.getUnique(id);
    }
    @ResponseBody
    @RequestMapping("/updateUnique")
    public void updateUnique( String id,int num){
        playermapper.updateUnique(id,num);
    }


    @ResponseBody
    @RequestMapping("/insertArch")
    public void insertArch(@RequestBody Map<String,Object> map){
       String playerid=map.get("player_id").toString();
       String archid=map.get("arch_id").toString();
       int order=(int)map.get("order");
        Player_arch playerArch=new Player_arch(playerid,archid,order);
        playermapper.insertArch(playerArch);
    }
    @ResponseBody
    @RequestMapping("/deleteArch")
    public void deleteArch(int order){

        playermapper.deleteArch(order);
    }
    @ResponseBody
    @RequestMapping("/getallArch")
    public ArrayList<Player_arch> getallArch(){
        return playermapper.getallArch();
    }

    @ResponseBody
    @RequestMapping("/insertCard")
    public void insertCard(@RequestBody Map<String,Object> map){
        String playerid=map.get("player_id").toString();
        String cardid=map.get("card_id").toString();
        int order=(int)map.get("order");
        Player_card playerCard=new Player_card(playerid,cardid,order);
        playermapper.insertCard(playerCard);
    }
    @ResponseBody
    @RequestMapping("/deleteCard")
    public void deleteCard(int order){

        playermapper.deleteCard(order);
    }
    @ResponseBody
    @RequestMapping("/getallCard")
    public ArrayList<Player_card> getallCard(String id){
        return playermapper.getallCard(id);
    }
}

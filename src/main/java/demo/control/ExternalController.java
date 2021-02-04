package demo.control;
import demo.entity.*;
import demo.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("/external")
public class ExternalController {

    @Autowired
    private ExternalMapper externalmapper;
    @Autowired
    private CardMapper cardmapper;
    @Autowired
    private PlayerMapper playermapper;
    @Autowired
    private RefereeMapper refereemapper;
    @Autowired
    private DeleteallMapper deleteallmapper;
    @ResponseBody
    @RequestMapping("/getPlayernum")
    public int getPlayernum(){
        return externalmapper.getPlayernum();
    }
    @ResponseBody
    @RequestMapping("/heapTohand")
    public void heapTohand(@RequestBody Map<String,Object>map){
        String playerid=map.get("player_id").toString();
        int order=(int)map.get("order");
        String cardid=map.get("card_id").toString();
        Player_card playercard=new Player_card(playerid,cardid,order);
        cardmapper.deleteFirstcard(order);
        playermapper.insertCard(playercard);
    }
    @ResponseBody
    @RequestMapping("/heapTolast")
    public void heapTolast(@RequestBody Map<String,Object>map){
        int order=(int)map.get("order");
        String cardid=map.get("card_id").toString();
        Card_order cardorder=new Card_order(order,cardid);
        cardmapper.deleteFirstcard(order);
        cardmapper.insertLastcard(cardorder);
    }
    @ResponseBody
    @RequestMapping("/handToarch")
    public void handToarch(@RequestBody Map<String,Object>map){
        String playerid=map.get("player_id").toString();
        int order=(int)map.get("order");
        String cardid=map.get("card_id").toString();
        Card card=cardmapper.getbyId(cardid);
        int pay=card.getPay();
        int money=playermapper.getMoney(playerid);
        int left=money-pay;
        int point=playermapper.getPoint(playerid);
        int point1=point +pay;
        Arch_kind archkind=playermapper.getArchnum(playerid);
        Player_arch playerarch=new Player_arch(playerid,cardid,order);
        playermapper.deleteCard(order);
        playermapper.updateMoney(playerid,left);
        playermapper.insertArch(playerarch);
        playermapper.updatePoint(playerid,point1);
        if(card.getKind()==1){
            playermapper.updateNoble(playerid,archkind.getNoble());
        }
        else  if(card.getKind()==2){
            playermapper.updateReligious(playerid,archkind.getReligious());
        }
        else  if(card.getKind()==3){
            playermapper.updateTrade(playerid,archkind.getTrade());
        }
        else  if(card.getKind()==4){
            playermapper.updateMiltary(playerid,archkind.getMiltary());
        }
        else  if(card.getKind()==5){
            playermapper.updateUnique(playerid,archkind.getUnique());
        }
    }
    @ResponseBody
    @RequestMapping("/initialize")
    public void initialize(){
        String cardid[]=new String[49];
        int order[]=new int[49];
        int bool[]=new int[49];
        for(int i=0;i<16;i++){
            for(int j=1;j<4;j++){
                cardid[i*3+j]=(i+1)+"";
            }
        }
        for(int i=1;i<49;i++){
            int num = (int)(Math.random()*48+1);
            if(bool[num]==0){
                order[i]=num;
                bool[num]=1;
            }
            else {

                int ran2=(int)(Math.random()*48);
                for(int p=ran2;p!=ran2+1;p--){
                    if(p==0)p=48;
                    if(bool[p]==0){
                        order[i]=p;
                        bool[p]=1;
                        break;
                    }
                }
            }

        }
        for(int i=1;i<49;i++){
            Card_order cardorder1=new Card_order(i,cardid[order[i]]);
            cardmapper.insertLastcard(cardorder1);
        }

    }


}

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
    @Autowired
    private RoleMapper rolemapper;
    @ResponseBody
    @RequestMapping("/getPlayernum")
    public int getPlayernum(){
        return externalmapper.getPlayernum();
    }
    @ResponseBody
    @RequestMapping("/initRolestate")
    public void initRolestate(int max,int choice){
        int num=externalmapper.getPlayernum();
        refereemapper.updatePlayernum("1",num);
        rolemapper.deleteRolestate();
        for(int i=1;i<=max;i++){
            rolemapper.insertRolestate(""+i,1);
        }
        for(int j=0;j<3;j++){

                int ran=(int)(Math.random()*max+1);
                if(rolemapper.getRoleleft(""+ran)==0)j--;
                else {
                    rolemapper.updateRoleleft(""+ran,0);
                }

        }

    }
    @ResponseBody
    @RequestMapping("/getRolestate")
    public Object getRolestate(){
        ArrayList<Role_state>rol = new ArrayList<>();
        for(int i=1;i<=9;i++){
            Role_state rs1=rolemapper.getRolestate(""+i);
            if(rs1==null)break;
            else if(rs1.getLeft()==0)continue;
            else rol.add(rs1);
        }
        return rol;
    }
    @ResponseBody
    @RequestMapping("/selectFirstcard")
    public Object selectFirstcard(int order){
        Card_order cardorder=cardmapper.getFirstcard(order);
        refereemapper.updateHeapfirst("1",order+1);
        cardmapper.deleteFirstcard(order);
        return cardorder;
    }
    @ResponseBody
    @RequestMapping("/heapTohand")
    public void heapTohand(@RequestBody Map<String,Object>map){
        String playerid=map.get("player_id").toString();
        int cardnum=playermapper.getCardnum(playerid);
        int order=(int)map.get("order");
        int firstorder=refereemapper.getHeapfirst("1");
        String cardid=map.get("card_id").toString();
        Player_card playercard=new Player_card(playerid,cardid,order);
       // cardmapper.deleteFirstcard(order);
       // refereemapper.updateHeapfirst("1",firstorder+1);
        playermapper.insertCard(playercard);
        playermapper.updateCardnum(playerid,cardnum+1);
    }
    @ResponseBody
    @RequestMapping("/heapTolast")
    public void heapTolast(String card_id){
        int lastorder=refereemapper.getHeaplast("1");
        Card_order cardorder=new Card_order(lastorder,card_id);
        cardmapper.insertLastcard(cardorder);
        refereemapper.updateHeaplast("1",lastorder+1);
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
        int cardnum=playermapper.getCardnum(playerid);
        Arch_kind archkind=playermapper.getArchnum(playerid);
        Player_arch playerarch=new Player_arch(playerid,cardid,order);
        playermapper.deleteCard(order);
        playermapper.updateCardnum(playerid,cardnum-1);
        playermapper.updateMoney(playerid,left);
        playermapper.insertArch(playerarch);
        playermapper.updatePoint(playerid,point1);
        if(card.getKind()==1){
            playermapper.updateNoble(playerid,archkind.getNoble()+1);
        }
        else  if(card.getKind()==2){
            playermapper.updateReligious(playerid,archkind.getReligious()+1);
        }
        else  if(card.getKind()==3){
            playermapper.updateTrade(playerid,archkind.getTrade()+1);
        }
        else  if(card.getKind()==4){
            playermapper.updateMiltary(playerid,archkind.getMiltary()+1);
        }
        else  if(card.getKind()==5){
            playermapper.updateUnique(playerid,archkind.getUnique()+1);
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

   @ResponseBody
    @RequestMapping("/setNextstate")
   public void setNextstate(int state,int order){
        if(state==0){
            int num=refereemapper.getPlayernum("1");
            if(order==num){
                refereemapper.updateState("1",1);
                refereemapper.updateStateorder("1",1);
            }
            else{
                refereemapper.updateStateorder("1",order+1);
            }
        }
        else if(state==1){
            refereemapper.updateState("1",2);
        }
        else {
            int num=refereemapper.getPlayernum("1");
            if(order==num){
                refereemapper.updateState("1",0);
                refereemapper.updateStateorder("1",1);
            }
            else {
                refereemapper.updateState("1",1);
                refereemapper.updateStateorder("1",order+1);
            }
        }
   }

    @ResponseBody
    @RequestMapping("/addMoney")
    public void addMoney(String id,int num){
        int now=playermapper.getMoney(id);
        playermapper.updateMoney(id,num+now);
    }



}

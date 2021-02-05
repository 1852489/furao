package demo.control;

import demo.entity.Card_order;
import demo.mapper.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardMapper cardmapper;

    @ResponseBody
    @RequestMapping("/getallCard")
    public Object getallCard(){
        return cardmapper.getallCard();
    };
    @ResponseBody
    @RequestMapping("/getbyId")
    public Object getbyId(String id){
        return cardmapper.getbyId(id);
    }

    @ResponseBody
    @RequestMapping("/getFirstcard")
    public Object getFirstcard(int order){

        return cardmapper.getFirstcard(order);
    }
    @ResponseBody
    @RequestMapping("/deleteFirstcard")
    public void deleteFirstcard(int order){
        cardmapper.deleteFirstcard(order);
    }
    @ResponseBody
    @RequestMapping("/insertLastcard")
    public void insertLastcard(@RequestBody Map<String,Object> map){
        int cardorder= (int) map.get("card_order");
        String cardid=map.get("card_id").toString();
        Card_order card_order1= new Card_order(cardorder,cardid);
        cardmapper.insertLastcard(card_order1);
    }
}
